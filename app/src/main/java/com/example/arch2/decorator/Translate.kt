package com.example.arch2.decorator

class Translate(decorator: StringDecorator) : Decorator(decorator) {
    override fun job(arg: String) {
        super.job(arg)
    }
}