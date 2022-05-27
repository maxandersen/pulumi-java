// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSyncGroupResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String storageSyncId;

    @CustomType.Constructor
    private GetSyncGroupResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("storageSyncId") String storageSyncId) {
        this.id = id;
        this.name = name;
        this.storageSyncId = storageSyncId;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String storageSyncId() {
        return this.storageSyncId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSyncGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String storageSyncId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSyncGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.storageSyncId = defaults.storageSyncId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder storageSyncId(String storageSyncId) {
            this.storageSyncId = Objects.requireNonNull(storageSyncId);
            return this;
        }        public GetSyncGroupResult build() {
            return new GetSyncGroupResult(id, name, storageSyncId);
        }
    }
}
