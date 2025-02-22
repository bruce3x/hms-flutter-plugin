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

part of huawei_nearbyservice;

class WifiSharePolicy {
  final int _mode;

  const WifiSharePolicy(this._mode);

  static const WifiSharePolicy share = WifiSharePolicy(1);
  static const WifiSharePolicy set = WifiSharePolicy(2);

  bool equals(dynamic object) {
    return identical(this, object) ||
        (object is WifiSharePolicy && _mode == object._mode);
  }

  @override
  String toString() {
    switch (_mode) {
      case 1:
        return 'POLICY_SHARE';
      case 2:
        return 'POLICY_SET';
      default:
        return 'POLICY_UNKNOWN';
    }
  }

  Map<String, dynamic> toMap() {
    return <String, dynamic>{
      'mode': _mode,
    };
  }
}
