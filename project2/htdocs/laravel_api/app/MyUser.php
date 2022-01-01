<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class MyUser extends Model
{
    public $timestamps = false;
    protected $fillable = [
        'id_user', 'phonenumber', 'password', 'name', 'dob', 'division', 'role', 'id_vaccination'
    ];
    protected $primaryKey = 'id_user';
    protected $table = 'myuser';

}
