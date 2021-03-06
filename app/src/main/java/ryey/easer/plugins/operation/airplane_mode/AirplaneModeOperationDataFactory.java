package ryey.easer.plugins.operation.airplane_mode;

import android.support.annotation.NonNull;

import ryey.easer.commons.C;
import ryey.easer.commons.IllegalStorageDataException;
import ryey.easer.commons.plugindef.ValidData;
import ryey.easer.commons.plugindef.operationplugin.OperationDataFactory;

class AirplaneModeOperationDataFactory implements OperationDataFactory<AirplaneModeOperationData> {
    @NonNull
    @Override
    public Class<AirplaneModeOperationData> dataClass() {
        return AirplaneModeOperationData.class;
    }

    @NonNull
    @Override
    public AirplaneModeOperationData emptyData() {
        return new AirplaneModeOperationData();
    }

    @ValidData
    @NonNull
    @Override
    public AirplaneModeOperationData dummyData() {
        AirplaneModeOperationData dummyData = new AirplaneModeOperationData();
        dummyData.set(true);
        return dummyData;
    }

    @ValidData
    @NonNull
    @Override
    public AirplaneModeOperationData parse(@NonNull String data, @NonNull C.Format format, int version) throws IllegalStorageDataException {
        return new AirplaneModeOperationData(data, format, version);
    }
}
