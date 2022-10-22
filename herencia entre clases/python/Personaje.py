#!/usr/bin/python
# -*- coding: UTF-8 -*-
class Personaje(object):
	def getExperiencia(self):
		return self.___experiencia

	def setExperiencia(self, aExperiencia):
		"""@ReturnType void"""
		self.___experiencia = aExperiencia

	def ganarExperiencia(self, aExperiencia):
		"""@ParamType aExperiencia int
		@ReturnType void"""
		pass

	def __init__(self):
		self.___experiencia = None

