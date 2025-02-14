// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.azurenative.synapse.outputs.EntityReferenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationRuntimeDataProxyPropertiesResponse {
    /**
     * @return The self-hosted integration runtime reference.
     * 
     */
    private final @Nullable EntityReferenceResponse connectVia;
    /**
     * @return The path to contain the staged data in the Blob storage.
     * 
     */
    private final @Nullable String path;
    /**
     * @return The staging linked service reference.
     * 
     */
    private final @Nullable EntityReferenceResponse stagingLinkedService;

    @CustomType.Constructor
    private IntegrationRuntimeDataProxyPropertiesResponse(
        @CustomType.Parameter("connectVia") @Nullable EntityReferenceResponse connectVia,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("stagingLinkedService") @Nullable EntityReferenceResponse stagingLinkedService) {
        this.connectVia = connectVia;
        this.path = path;
        this.stagingLinkedService = stagingLinkedService;
    }

    /**
     * @return The self-hosted integration runtime reference.
     * 
     */
    public Optional<EntityReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * @return The path to contain the staged data in the Blob storage.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The staging linked service reference.
     * 
     */
    public Optional<EntityReferenceResponse> stagingLinkedService() {
        return Optional.ofNullable(this.stagingLinkedService);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeDataProxyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EntityReferenceResponse connectVia;
        private @Nullable String path;
        private @Nullable EntityReferenceResponse stagingLinkedService;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeDataProxyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectVia = defaults.connectVia;
    	      this.path = defaults.path;
    	      this.stagingLinkedService = defaults.stagingLinkedService;
        }

        public Builder connectVia(@Nullable EntityReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder stagingLinkedService(@Nullable EntityReferenceResponse stagingLinkedService) {
            this.stagingLinkedService = stagingLinkedService;
            return this;
        }        public IntegrationRuntimeDataProxyPropertiesResponse build() {
            return new IntegrationRuntimeDataProxyPropertiesResponse(connectVia, path, stagingLinkedService);
        }
    }
}
