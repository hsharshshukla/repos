# -*- coding: utf-8 -*-
# Generated by Django 1.10.1 on 2018-03-07 21:03
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('buysale', '0001_initial'),
    ]

    operations = [
        migrations.CreateModel(
            name='newsletter',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('owner_email', models.EmailField(max_length=200)),
            ],
        ),
        migrations.RemoveField(
            model_name='car',
            name='veh_expectedprice',
        ),
    ]