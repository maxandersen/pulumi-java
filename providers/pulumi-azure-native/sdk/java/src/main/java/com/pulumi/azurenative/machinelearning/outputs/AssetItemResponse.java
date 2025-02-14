// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.outputs;

import com.pulumi.azurenative.machinelearning.outputs.BlobLocationResponse;
import com.pulumi.azurenative.machinelearning.outputs.InputPortResponse;
import com.pulumi.azurenative.machinelearning.outputs.ModuleAssetParameterResponse;
import com.pulumi.azurenative.machinelearning.outputs.OutputPortResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AssetItemResponse {
    /**
     * @return Asset&#39;s Id.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Information about the asset&#39;s input ports.
     * 
     */
    private final @Nullable Map<String,InputPortResponse> inputPorts;
    /**
     * @return Access information for the asset.
     * 
     */
    private final BlobLocationResponse locationInfo;
    /**
     * @return If the asset is a custom module, this holds the module&#39;s metadata.
     * 
     */
    private final @Nullable Map<String,String> metadata;
    /**
     * @return Asset&#39;s friendly name.
     * 
     */
    private final String name;
    /**
     * @return Information about the asset&#39;s output ports.
     * 
     */
    private final @Nullable Map<String,OutputPortResponse> outputPorts;
    /**
     * @return If the asset is a custom module, this holds the module&#39;s parameters.
     * 
     */
    private final @Nullable List<ModuleAssetParameterResponse> parameters;
    /**
     * @return Asset&#39;s type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AssetItemResponse(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("inputPorts") @Nullable Map<String,InputPortResponse> inputPorts,
        @CustomType.Parameter("locationInfo") BlobLocationResponse locationInfo,
        @CustomType.Parameter("metadata") @Nullable Map<String,String> metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outputPorts") @Nullable Map<String,OutputPortResponse> outputPorts,
        @CustomType.Parameter("parameters") @Nullable List<ModuleAssetParameterResponse> parameters,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.inputPorts = inputPorts;
        this.locationInfo = locationInfo;
        this.metadata = metadata;
        this.name = name;
        this.outputPorts = outputPorts;
        this.parameters = parameters;
        this.type = type;
    }

    /**
     * @return Asset&#39;s Id.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Information about the asset&#39;s input ports.
     * 
     */
    public Map<String,InputPortResponse> inputPorts() {
        return this.inputPorts == null ? Map.of() : this.inputPorts;
    }
    /**
     * @return Access information for the asset.
     * 
     */
    public BlobLocationResponse locationInfo() {
        return this.locationInfo;
    }
    /**
     * @return If the asset is a custom module, this holds the module&#39;s metadata.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * @return Asset&#39;s friendly name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Information about the asset&#39;s output ports.
     * 
     */
    public Map<String,OutputPortResponse> outputPorts() {
        return this.outputPorts == null ? Map.of() : this.outputPorts;
    }
    /**
     * @return If the asset is a custom module, this holds the module&#39;s parameters.
     * 
     */
    public List<ModuleAssetParameterResponse> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * @return Asset&#39;s type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable Map<String,InputPortResponse> inputPorts;
        private BlobLocationResponse locationInfo;
        private @Nullable Map<String,String> metadata;
        private String name;
        private @Nullable Map<String,OutputPortResponse> outputPorts;
        private @Nullable List<ModuleAssetParameterResponse> parameters;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.inputPorts = defaults.inputPorts;
    	      this.locationInfo = defaults.locationInfo;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.outputPorts = defaults.outputPorts;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder inputPorts(@Nullable Map<String,InputPortResponse> inputPorts) {
            this.inputPorts = inputPorts;
            return this;
        }
        public Builder locationInfo(BlobLocationResponse locationInfo) {
            this.locationInfo = Objects.requireNonNull(locationInfo);
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outputPorts(@Nullable Map<String,OutputPortResponse> outputPorts) {
            this.outputPorts = outputPorts;
            return this;
        }
        public Builder parameters(@Nullable List<ModuleAssetParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(ModuleAssetParameterResponse... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AssetItemResponse build() {
            return new AssetItemResponse(id, inputPorts, locationInfo, metadata, name, outputPorts, parameters, type);
        }
    }
}
