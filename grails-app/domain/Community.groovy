class Community {

    String name
    String reference

    static hasMany = [partners:Partner]

    static constraints = {
        name()
        reference(blank:false,unique:true)
    }

    String toString() { "$name : $reference" }    
}