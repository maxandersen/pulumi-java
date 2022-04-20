// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.inputs.BlobLocationResponse;
import com.pulumi.azurenative.machinelearning.inputs.InputPortResponse;
import com.pulumi.azurenative.machinelearning.inputs.ModuleAssetParameterResponse;
import com.pulumi.azurenative.machinelearning.inputs.OutputPortResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about an asset associated with the web service.
 * 
 */
public final class AssetItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final AssetItemResponse Empty = new AssetItemResponse();

    /**
     * Asset&#39;s Id.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Information about the asset&#39;s input ports.
     * 
     */
    @Import(name="inputPorts")
      private final @Nullable Map<String,InputPortResponse> inputPorts;

    public Map<String,InputPortResponse> inputPorts() {
        return this.inputPorts == null ? Map.of() : this.inputPorts;
    }

    /**
     * Access information for the asset.
     * 
     */
    @Import(name="locationInfo", required=true)
      private final BlobLocationResponse locationInfo;

    public BlobLocationResponse locationInfo() {
        return this.locationInfo;
    }

    /**
     * If the asset is a custom module, this holds the module&#39;s metadata.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Map<String,String> metadata;

    public Map<String,String> metadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }

    /**
     * Asset&#39;s friendly name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Information about the asset&#39;s output ports.
     * 
     */
    @Import(name="outputPorts")
      private final @Nullable Map<String,OutputPortResponse> outputPorts;

    public Map<String,OutputPortResponse> outputPorts() {
        return this.outputPorts == null ? Map.of() : this.outputPorts;
    }

    /**
     * If the asset is a custom module, this holds the module&#39;s parameters.
     * 
     */
    @Import(name="parameters")
      private final @Nullable List<ModuleAssetParameterResponse> parameters;

    public List<ModuleAssetParameterResponse> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    /**
     * Asset&#39;s type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public AssetItemResponse(
        @Nullable String id,
        @Nullable Map<String,InputPortResponse> inputPorts,
        BlobLocationResponse locationInfo,
        @Nullable Map<String,String> metadata,
        String name,
        @Nullable Map<String,OutputPortResponse> outputPorts,
        @Nullable List<ModuleAssetParameterResponse> parameters,
        String type) {
        this.id = id;
        this.inputPorts = inputPorts;
        this.locationInfo = Objects.requireNonNull(locationInfo, "expected parameter 'locationInfo' to be non-null");
        this.metadata = metadata;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.outputPorts = outputPorts;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AssetItemResponse() {
        this.id = null;
        this.inputPorts = Map.of();
        this.locationInfo = null;
        this.metadata = Map.of();
        this.name = null;
        this.outputPorts = Map.of();
        this.parameters = List.of();
        this.type = null;
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
