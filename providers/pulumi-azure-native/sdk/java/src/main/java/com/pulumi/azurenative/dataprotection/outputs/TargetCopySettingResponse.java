// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.outputs;

import com.pulumi.azurenative.dataprotection.outputs.CopyOnExpiryOptionResponse;
import com.pulumi.azurenative.dataprotection.outputs.CustomCopyOptionResponse;
import com.pulumi.azurenative.dataprotection.outputs.DataStoreInfoBaseResponse;
import com.pulumi.azurenative.dataprotection.outputs.ImmediateCopyOptionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;

@CustomType
public final class TargetCopySettingResponse {
    /**
     * It can be CustomCopyOption or ImmediateCopyOption.
     * 
     */
    private final Object copyAfter;
    /**
     * Info of target datastore
     * 
     */
    private final DataStoreInfoBaseResponse dataStore;

    @CustomType.Constructor
    private TargetCopySettingResponse(
        @CustomType.Parameter("copyAfter") Object copyAfter,
        @CustomType.Parameter("dataStore") DataStoreInfoBaseResponse dataStore) {
        this.copyAfter = copyAfter;
        this.dataStore = dataStore;
    }

    /**
     * It can be CustomCopyOption or ImmediateCopyOption.
     * 
    */
    public Object copyAfter() {
        return this.copyAfter;
    }
    /**
     * Info of target datastore
     * 
    */
    public DataStoreInfoBaseResponse dataStore() {
        return this.dataStore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetCopySettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object copyAfter;
        private DataStoreInfoBaseResponse dataStore;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetCopySettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyAfter = defaults.copyAfter;
    	      this.dataStore = defaults.dataStore;
        }

        public Builder copyAfter(Object copyAfter) {
            this.copyAfter = Objects.requireNonNull(copyAfter);
            return this;
        }
        public Builder dataStore(DataStoreInfoBaseResponse dataStore) {
            this.dataStore = Objects.requireNonNull(dataStore);
            return this;
        }        public TargetCopySettingResponse build() {
            return new TargetCopySettingResponse(copyAfter, dataStore);
        }
    }
}
