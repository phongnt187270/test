<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateVaccinationcard extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('vaccinationcard', function (Blueprint $table) {
            $table->string('vaccination_info_id');
            $table->string('manufacturer');
            $table->string('dose');
            $table->string('injected_location');
            $table->date('injected_date');
            $table->string('cargo_number');
            $table->primary('vaccination_info_id');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('vaccinationcard');
    }
}
