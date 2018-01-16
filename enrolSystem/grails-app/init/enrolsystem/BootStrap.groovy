package com.enrol

class BootStrap {

    def init = { servletContext ->
def computing= new 
Course (    
department:'Computing',
code:'CS123',
title:'BSc Hon Computing',
leader:'Dr Michelle Murphy',
startDate:new Date('09/09/2018'),
endDate:new Date('07/07/2022'),
numberOfStudents:22,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:'hfdhdfkjhfdskjhfdkjhgfdshdkjhshfskjhgshgkjhgfs'

).save()

def database= new
Module (
title:'Dog2',
code:'Dogs on a plane',
credits:20,
lecturer:'DR dog',
course:'dogs on aplane',
description:'dogs hijack a plane'
).save()





}
    def destroy = {
    }
}
