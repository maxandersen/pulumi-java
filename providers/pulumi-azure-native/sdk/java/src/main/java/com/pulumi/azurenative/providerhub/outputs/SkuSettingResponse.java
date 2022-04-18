// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.outputs;

import com.pulumi.azurenative.providerhub.outputs.SkuCapabilityResponse;
import com.pulumi.azurenative.providerhub.outputs.SkuCostResponse;
import com.pulumi.azurenative.providerhub.outputs.SkuLocationInfoResponse;
import com.pulumi.azurenative.providerhub.outputs.SkuSettingResponseCapacity;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SkuSettingResponse {
    private final @Nullable List<SkuCapabilityResponse> capabilities;
    private final @Nullable SkuSettingResponseCapacity capacity;
    private final @Nullable List<SkuCostResponse> costs;
    private final @Nullable String family;
    private final @Nullable String kind;
    private final @Nullable List<SkuLocationInfoResponse> locationInfo;
    private final @Nullable List<String> locations;
    private final String name;
    private final @Nullable List<String> requiredFeatures;
    private final @Nullable List<String> requiredQuotaIds;
    private final @Nullable String size;
    private final @Nullable String tier;

    @CustomType.Constructor
    private SkuSettingResponse(
        @CustomType.Parameter("capabilities") @Nullable List<SkuCapabilityResponse> capabilities,
        @CustomType.Parameter("capacity") @Nullable SkuSettingResponseCapacity capacity,
        @CustomType.Parameter("costs") @Nullable List<SkuCostResponse> costs,
        @CustomType.Parameter("family") @Nullable String family,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("locationInfo") @Nullable List<SkuLocationInfoResponse> locationInfo,
        @CustomType.Parameter("locations") @Nullable List<String> locations,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("requiredFeatures") @Nullable List<String> requiredFeatures,
        @CustomType.Parameter("requiredQuotaIds") @Nullable List<String> requiredQuotaIds,
        @CustomType.Parameter("size") @Nullable String size,
        @CustomType.Parameter("tier") @Nullable String tier) {
        this.capabilities = capabilities;
        this.capacity = capacity;
        this.costs = costs;
        this.family = family;
        this.kind = kind;
        this.locationInfo = locationInfo;
        this.locations = locations;
        this.name = name;
        this.requiredFeatures = requiredFeatures;
        this.requiredQuotaIds = requiredQuotaIds;
        this.size = size;
        this.tier = tier;
    }

    public List<SkuCapabilityResponse> capabilities() {
        return this.capabilities == null ? List.of() : this.capabilities;
    }
    public Optional<SkuSettingResponseCapacity> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    public List<SkuCostResponse> costs() {
        return this.costs == null ? List.of() : this.costs;
    }
    public Optional<String> family() {
        return Optional.ofNullable(this.family);
    }
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    public List<SkuLocationInfoResponse> locationInfo() {
        return this.locationInfo == null ? List.of() : this.locationInfo;
    }
    public List<String> locations() {
        return this.locations == null ? List.of() : this.locations;
    }
    public String name() {
        return this.name;
    }
    public List<String> requiredFeatures() {
        return this.requiredFeatures == null ? List.of() : this.requiredFeatures;
    }
    public List<String> requiredQuotaIds() {
        return this.requiredQuotaIds == null ? List.of() : this.requiredQuotaIds;
    }
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SkuCapabilityResponse> capabilities;
        private @Nullable SkuSettingResponseCapacity capacity;
        private @Nullable List<SkuCostResponse> costs;
        private @Nullable String family;
        private @Nullable String kind;
        private @Nullable List<SkuLocationInfoResponse> locationInfo;
        private @Nullable List<String> locations;
        private String name;
        private @Nullable List<String> requiredFeatures;
        private @Nullable List<String> requiredQuotaIds;
        private @Nullable String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.capacity = defaults.capacity;
    	      this.costs = defaults.costs;
    	      this.family = defaults.family;
    	      this.kind = defaults.kind;
    	      this.locationInfo = defaults.locationInfo;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.requiredFeatures = defaults.requiredFeatures;
    	      this.requiredQuotaIds = defaults.requiredQuotaIds;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder capabilities(@Nullable List<SkuCapabilityResponse> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public Builder capabilities(SkuCapabilityResponse... capabilities) {
            return capabilities(List.of(capabilities));
        }
        public Builder capacity(@Nullable SkuSettingResponseCapacity capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder costs(@Nullable List<SkuCostResponse> costs) {
            this.costs = costs;
            return this;
        }
        public Builder costs(SkuCostResponse... costs) {
            return costs(List.of(costs));
        }
        public Builder family(@Nullable String family) {
            this.family = family;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder locationInfo(@Nullable List<SkuLocationInfoResponse> locationInfo) {
            this.locationInfo = locationInfo;
            return this;
        }
        public Builder locationInfo(SkuLocationInfoResponse... locationInfo) {
            return locationInfo(List.of(locationInfo));
        }
        public Builder locations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder requiredFeatures(@Nullable List<String> requiredFeatures) {
            this.requiredFeatures = requiredFeatures;
            return this;
        }
        public Builder requiredFeatures(String... requiredFeatures) {
            return requiredFeatures(List.of(requiredFeatures));
        }
        public Builder requiredQuotaIds(@Nullable List<String> requiredQuotaIds) {
            this.requiredQuotaIds = requiredQuotaIds;
            return this;
        }
        public Builder requiredQuotaIds(String... requiredQuotaIds) {
            return requiredQuotaIds(List.of(requiredQuotaIds));
        }
        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public SkuSettingResponse build() {
            return new SkuSettingResponse(capabilities, capacity, costs, family, kind, locationInfo, locations, name, requiredFeatures, requiredQuotaIds, size, tier);
        }
    }
}
