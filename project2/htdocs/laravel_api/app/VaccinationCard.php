<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class VaccinationCard extends Model
{
    //
    public $timestamps = false;
    protected $fillable = [
        'vaccination_info_id', 'manufacturer', 'dose', 'injected_location', 'injected_date', 'cargo_number'
    ];
    protected $primaryKey = 'vaccination_info_id';
    protected $table = 'vaccinationcard';
}
