<%@ page import="art.ArtWork" %>
<html>
<head>
    <style>

    </style>
    <meta name="layout" content="main"/>
    <title>Home Page</title>
</head>
<body>

<div id="content" role="main">
    <section class="row col-12">

        <p class="text-success">There are ${artWorkTotal} creatures in the database.</p>

        <ul>
            <g:each in="${ArtWork.list()}" var="artWork">
                <div class="container-fluid bg-1 text-center">
                    <h3 class="margin">Who am I ?</h3>
                    <img src="${artWork.link}" class="img-responsive img-circle margin" style="display:inline" alt="${artWork.name}" >
                    <h3>I'm an ${artWork.name}</h3>
                </div>
                <div class="container-fluid bg-2 text-center">
                    <h3 class="margin">What Am I?</h3>
                    <p><p>${artWork.description}</p>
                    <a href="https://www.google.pl/#q=${artWork.name}&*" class="btn btn-default btn-lg">
                        <span class="glyphicon glyphicon-search"></span> Search
                    </a>
                </div>
                <div class="container-fluid bg-1 text-center">
                      
                </div>
            </g:each>
        </ul>

        <g:form action="updateName" style="margin: 0 auto; width:320px">
            <g:textField name="name" value="" />
            <g:submitButton name="Update name" />
        </g:form>

    </section>
</div>

</body>
</html>
