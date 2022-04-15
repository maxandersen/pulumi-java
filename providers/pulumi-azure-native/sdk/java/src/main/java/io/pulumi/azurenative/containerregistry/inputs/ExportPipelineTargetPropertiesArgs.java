// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of the export pipeline target.
 * 
 */
public final class ExportPipelineTargetPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExportPipelineTargetPropertiesArgs Empty = new ExportPipelineTargetPropertiesArgs();

    /**
     * They key vault secret uri to obtain the target storage SAS token.
     * 
     */
    @Import(name="keyVaultUri", required=true)
      private final Output<String> keyVaultUri;

    public Output<String> keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * The type of target for the export pipeline.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * The target uri of the export pipeline.
     * When 'AzureStorageBlob': "https://accountName.blob.core.windows.net/containerName/blobName"
     * When 'AzureStorageBlobContainer':  "https://accountName.blob.core.windows.net/containerName"
     * 
     */
    @Import(name="uri")
      private final @Nullable Output<String> uri;

    public Output<String> uri() {
        return this.uri == null ? Codegen.empty() : this.uri;
    }

    public ExportPipelineTargetPropertiesArgs(
        Output<String> keyVaultUri,
        @Nullable Output<String> type,
        @Nullable Output<String> uri) {
        this.keyVaultUri = Objects.requireNonNull(keyVaultUri, "expected parameter 'keyVaultUri' to be non-null");
        this.type = type;
        this.uri = uri;
    }

    private ExportPipelineTargetPropertiesArgs() {
        this.keyVaultUri = Codegen.empty();
        this.type = Codegen.empty();
        this.uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportPipelineTargetPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> keyVaultUri;
        private @Nullable Output<String> type;
        private @Nullable Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportPipelineTargetPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder keyVaultUri(Output<String> keyVaultUri) {
            this.keyVaultUri = Objects.requireNonNull(keyVaultUri);
            return this;
        }
        public Builder keyVaultUri(String keyVaultUri) {
            this.keyVaultUri = Output.of(Objects.requireNonNull(keyVaultUri));
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder uri(@Nullable Output<String> uri) {
            this.uri = uri;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = Codegen.ofNullable(uri);
            return this;
        }        public ExportPipelineTargetPropertiesArgs build() {
            return new ExportPipelineTargetPropertiesArgs(keyVaultUri, type, uri);
        }
    }
}
