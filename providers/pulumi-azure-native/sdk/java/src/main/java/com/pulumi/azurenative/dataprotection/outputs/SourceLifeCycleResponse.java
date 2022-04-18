// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.outputs;

import com.pulumi.azurenative.dataprotection.outputs.AbsoluteDeleteOptionResponse;
import com.pulumi.azurenative.dataprotection.outputs.DataStoreInfoBaseResponse;
import com.pulumi.azurenative.dataprotection.outputs.TargetCopySettingResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SourceLifeCycleResponse {
    /**
     * Delete Option
     * 
     */
    private final AbsoluteDeleteOptionResponse deleteAfter;
    /**
     * DataStoreInfo base
     * 
     */
    private final DataStoreInfoBaseResponse sourceDataStore;
    private final @Nullable List<TargetCopySettingResponse> targetDataStoreCopySettings;

    @CustomType.Constructor
    private SourceLifeCycleResponse(
        @CustomType.Parameter("deleteAfter") AbsoluteDeleteOptionResponse deleteAfter,
        @CustomType.Parameter("sourceDataStore") DataStoreInfoBaseResponse sourceDataStore,
        @CustomType.Parameter("targetDataStoreCopySettings") @Nullable List<TargetCopySettingResponse> targetDataStoreCopySettings) {
        this.deleteAfter = deleteAfter;
        this.sourceDataStore = sourceDataStore;
        this.targetDataStoreCopySettings = targetDataStoreCopySettings;
    }

    /**
     * Delete Option
     * 
    */
    public AbsoluteDeleteOptionResponse deleteAfter() {
        return this.deleteAfter;
    }
    /**
     * DataStoreInfo base
     * 
    */
    public DataStoreInfoBaseResponse sourceDataStore() {
        return this.sourceDataStore;
    }
    public List<TargetCopySettingResponse> targetDataStoreCopySettings() {
        return this.targetDataStoreCopySettings == null ? List.of() : this.targetDataStoreCopySettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceLifeCycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AbsoluteDeleteOptionResponse deleteAfter;
        private DataStoreInfoBaseResponse sourceDataStore;
        private @Nullable List<TargetCopySettingResponse> targetDataStoreCopySettings;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceLifeCycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteAfter = defaults.deleteAfter;
    	      this.sourceDataStore = defaults.sourceDataStore;
    	      this.targetDataStoreCopySettings = defaults.targetDataStoreCopySettings;
        }

        public Builder deleteAfter(AbsoluteDeleteOptionResponse deleteAfter) {
            this.deleteAfter = Objects.requireNonNull(deleteAfter);
            return this;
        }
        public Builder sourceDataStore(DataStoreInfoBaseResponse sourceDataStore) {
            this.sourceDataStore = Objects.requireNonNull(sourceDataStore);
            return this;
        }
        public Builder targetDataStoreCopySettings(@Nullable List<TargetCopySettingResponse> targetDataStoreCopySettings) {
            this.targetDataStoreCopySettings = targetDataStoreCopySettings;
            return this;
        }
        public Builder targetDataStoreCopySettings(TargetCopySettingResponse... targetDataStoreCopySettings) {
            return targetDataStoreCopySettings(List.of(targetDataStoreCopySettings));
        }        public SourceLifeCycleResponse build() {
            return new SourceLifeCycleResponse(deleteAfter, sourceDataStore, targetDataStoreCopySettings);
        }
    }
}
