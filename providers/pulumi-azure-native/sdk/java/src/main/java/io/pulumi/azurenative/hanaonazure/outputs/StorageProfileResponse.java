// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure.outputs;

import io.pulumi.azurenative.hanaonazure.outputs.DiskResponse;
import io.pulumi.azurenative.hanaonazure.outputs.SAPSystemIDResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class StorageProfileResponse {
    /**
     * Specifies information related to SAP system IDs for the hana instance.
     * 
     */
    private final @Nullable List<SAPSystemIDResponse> hanaSids;
    /**
     * IP Address to connect to storage.
     * 
     */
    private final String nfsIpAddress;
    /**
     * Specifies information about the operating system disk used by the hana instance.
     * 
     */
    private final @Nullable List<DiskResponse> osDisks;

    @CustomType.Constructor
    private StorageProfileResponse(
        @CustomType.Parameter("hanaSids") @Nullable List<SAPSystemIDResponse> hanaSids,
        @CustomType.Parameter("nfsIpAddress") String nfsIpAddress,
        @CustomType.Parameter("osDisks") @Nullable List<DiskResponse> osDisks) {
        this.hanaSids = hanaSids;
        this.nfsIpAddress = nfsIpAddress;
        this.osDisks = osDisks;
    }

    /**
     * Specifies information related to SAP system IDs for the hana instance.
     * 
    */
    public List<SAPSystemIDResponse> hanaSids() {
        return this.hanaSids == null ? List.of() : this.hanaSids;
    }
    /**
     * IP Address to connect to storage.
     * 
    */
    public String nfsIpAddress() {
        return this.nfsIpAddress;
    }
    /**
     * Specifies information about the operating system disk used by the hana instance.
     * 
    */
    public List<DiskResponse> osDisks() {
        return this.osDisks == null ? List.of() : this.osDisks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SAPSystemIDResponse> hanaSids;
        private String nfsIpAddress;
        private @Nullable List<DiskResponse> osDisks;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hanaSids = defaults.hanaSids;
    	      this.nfsIpAddress = defaults.nfsIpAddress;
    	      this.osDisks = defaults.osDisks;
        }

        public Builder hanaSids(@Nullable List<SAPSystemIDResponse> hanaSids) {
            this.hanaSids = hanaSids;
            return this;
        }
        public Builder hanaSids(SAPSystemIDResponse... hanaSids) {
            return hanaSids(List.of(hanaSids));
        }
        public Builder nfsIpAddress(String nfsIpAddress) {
            this.nfsIpAddress = Objects.requireNonNull(nfsIpAddress);
            return this;
        }
        public Builder osDisks(@Nullable List<DiskResponse> osDisks) {
            this.osDisks = osDisks;
            return this;
        }
        public Builder osDisks(DiskResponse... osDisks) {
            return osDisks(List.of(osDisks));
        }        public StorageProfileResponse build() {
            return new StorageProfileResponse(hanaSids, nfsIpAddress, osDisks);
        }
    }
}
