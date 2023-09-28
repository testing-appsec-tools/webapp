# Remediations for 7 vulnerabilities
 

# /python.pyramid.security.sqlalchemy-sql-injection.pyramid-sqlalchemy-sql-inje ction.json 
from pyramid.view import view_config
from sqlalchemy import func
from myapp.models import MyModel


@view_config(route_name='example', renderer='json')
def example_view(request):
    user_input = request.params.get('user_input')

    query = request.dbsession.query(MyModel)
    query = query.filter("column_name = '{}'".format(user_input))

    results = query.all()

    return {'results': results}


# /python.lang.security.audit.subprocess-shell-true.subprocess-shell-true.json

import subprocess
output = subprocess.check_output(f"nslookup2 {mydomain}", shell=True, encoding='UTF-8')


# /python.jwt.security.unverified-jwt-decode.unverified-jwt-decode.json
import jwt
token = 'your_jwt_token'
decoded_token = jwt.decode(token, verify=False)

# /python.lang.security.unverified-ssl-context.unverified-ssl-context.json
import ssl
context = ssl._create_unverified_context()  # Triggers the rule
