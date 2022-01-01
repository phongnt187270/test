<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class MyUser extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('MyUser', function (Blueprint $table) {
            $table->string('id_user');
            $table->string('phonenumber');
            $table->string('password');
            $table->string('name');
            $table->datetime('dob');
            $table->string('division');
            $table->string('role');
            $table->string('id_vaccination');
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('MyUser');
    }
}
