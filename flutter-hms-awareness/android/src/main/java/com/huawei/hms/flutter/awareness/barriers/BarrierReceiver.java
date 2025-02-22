/*
    Copyright 2020-2022. Huawei Technologies Co., Ltd. All rights reserved.

    Licensed under the Apache License, Version 2.0 (the "License")
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        https://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package com.huawei.hms.flutter.awareness.barriers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.huawei.hms.flutter.awareness.utils.Convert;
import com.huawei.hms.kit.awareness.barrier.BarrierStatus;

import io.flutter.plugin.common.EventChannel;

public class BarrierReceiver extends BroadcastReceiver {
    final EventChannel.EventSink events;

    public BarrierReceiver(final EventChannel.EventSink events) {
        this.events = events;
    }

    @Override
    public void onReceive(final Context c, final Intent intent) {
        final BarrierStatus barrierStatus = BarrierStatus.extract(intent);
        events.success(Convert.barrierStatusToJson(barrierStatus).toString());
    }
}

