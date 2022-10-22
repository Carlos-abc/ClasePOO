#!/usr/bin/python
# -*- coding: UTF-8 -*-
class Usuario(object):
	def getPuntos(self):
		return self.___puntos

	def setPuntos(self, aPuntos):
		"""@ReturnType void"""
		self.___puntos = aPuntos

	def ganarPuntos(self, aPuntos):
		"""@ParamType aPuntos int
		@ReturnType void"""
		pass

	def __init__(self):
		self.___puntos = None

