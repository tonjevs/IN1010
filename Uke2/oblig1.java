class Dataklynge:
	## Oppretter tom dataklynge for racks med oppgitt maxtall noder/ rack
	# @param noderPerRack max antall noder som kan plasseres i et rack
	def __init__(self, noderPerRack):
		pass

	## Alternativ konstruktor for de som loser oppgave d). Kan ellers ignoreres
	## Leser data om dataklynge fra fil, bygger datastrukturen.
	# @param filnavn filene der dataene for dataklyngen ligger
#	def __init__(self, filnavn):
#		pass

	## Plasserer en node inn i et rack med ledig plass, eller i et nytt
	# @param node referanse til noden som skal settes inn i datastrukturen
	def settInnNode(self, node):
		pass

	## Beregner totalt antall prosessorer i hele dataklyngen
	# @return totalt antall prosessorer
	def antProsessorer(self):
		pass

	## Beregner antall noder i dataklyngen med minne over angitt grense
	# @param paakrevdMinne hvor mye minne skal noder som telles med ha
	# @return antall noder med tilstrekkelig minne
	def noderMedNokMinne(self, paakrevdMinne):
		pass

	## Henter antall racks i regneklyngen
	# @return antall racks
	def antRacks(self):
		pass
