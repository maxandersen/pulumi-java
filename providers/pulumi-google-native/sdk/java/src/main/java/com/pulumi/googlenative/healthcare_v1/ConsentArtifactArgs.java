// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.healthcare_v1.inputs.ImageArgs;
import com.pulumi.googlenative.healthcare_v1.inputs.SignatureArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConsentArtifactArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConsentArtifactArgs Empty = new ConsentArtifactArgs();

    /**
     * Optional. Screenshots, PDFs, or other binary information documenting the user&#39;s consent.
     * 
     */
    @Import(name="consentContentScreenshots")
      private final @Nullable Output<List<ImageArgs>> consentContentScreenshots;

    public Output<List<ImageArgs>> consentContentScreenshots() {
        return this.consentContentScreenshots == null ? Codegen.empty() : this.consentContentScreenshots;
    }

    /**
     * Optional. An string indicating the version of the consent information shown to the user.
     * 
     */
    @Import(name="consentContentVersion")
      private final @Nullable Output<String> consentContentVersion;

    public Output<String> consentContentVersion() {
        return this.consentContentVersion == null ? Codegen.empty() : this.consentContentVersion;
    }

    @Import(name="consentStoreId", required=true)
      private final Output<String> consentStoreId;

    public Output<String> consentStoreId() {
        return this.consentStoreId;
    }

    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * Optional. A signature from a guardian.
     * 
     */
    @Import(name="guardianSignature")
      private final @Nullable Output<SignatureArgs> guardianSignature;

    public Output<SignatureArgs> guardianSignature() {
        return this.guardianSignature == null ? Codegen.empty() : this.guardianSignature;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Resource name of the Consent artifact, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. Cannot be changed after creation.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * User&#39;s UUID provided by the client.
     * 
     */
    @Import(name="userId", required=true)
      private final Output<String> userId;

    public Output<String> userId() {
        return this.userId;
    }

    /**
     * Optional. User&#39;s signature.
     * 
     */
    @Import(name="userSignature")
      private final @Nullable Output<SignatureArgs> userSignature;

    public Output<SignatureArgs> userSignature() {
        return this.userSignature == null ? Codegen.empty() : this.userSignature;
    }

    /**
     * Optional. A signature from a witness.
     * 
     */
    @Import(name="witnessSignature")
      private final @Nullable Output<SignatureArgs> witnessSignature;

    public Output<SignatureArgs> witnessSignature() {
        return this.witnessSignature == null ? Codegen.empty() : this.witnessSignature;
    }

    public ConsentArtifactArgs(
        @Nullable Output<List<ImageArgs>> consentContentScreenshots,
        @Nullable Output<String> consentContentVersion,
        Output<String> consentStoreId,
        Output<String> datasetId,
        @Nullable Output<SignatureArgs> guardianSignature,
        @Nullable Output<String> location,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> userId,
        @Nullable Output<SignatureArgs> userSignature,
        @Nullable Output<SignatureArgs> witnessSignature) {
        this.consentContentScreenshots = consentContentScreenshots;
        this.consentContentVersion = consentContentVersion;
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.guardianSignature = guardianSignature;
        this.location = location;
        this.metadata = metadata;
        this.name = name;
        this.project = project;
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
        this.userSignature = userSignature;
        this.witnessSignature = witnessSignature;
    }

    private ConsentArtifactArgs() {
        this.consentContentScreenshots = Codegen.empty();
        this.consentContentVersion = Codegen.empty();
        this.consentStoreId = Codegen.empty();
        this.datasetId = Codegen.empty();
        this.guardianSignature = Codegen.empty();
        this.location = Codegen.empty();
        this.metadata = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.userId = Codegen.empty();
        this.userSignature = Codegen.empty();
        this.witnessSignature = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ImageArgs>> consentContentScreenshots;
        private @Nullable Output<String> consentContentVersion;
        private Output<String> consentStoreId;
        private Output<String> datasetId;
        private @Nullable Output<SignatureArgs> guardianSignature;
        private @Nullable Output<String> location;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> userId;
        private @Nullable Output<SignatureArgs> userSignature;
        private @Nullable Output<SignatureArgs> witnessSignature;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentArtifactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentContentScreenshots = defaults.consentContentScreenshots;
    	      this.consentContentVersion = defaults.consentContentVersion;
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.datasetId = defaults.datasetId;
    	      this.guardianSignature = defaults.guardianSignature;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.userId = defaults.userId;
    	      this.userSignature = defaults.userSignature;
    	      this.witnessSignature = defaults.witnessSignature;
        }

        public Builder consentContentScreenshots(@Nullable Output<List<ImageArgs>> consentContentScreenshots) {
            this.consentContentScreenshots = consentContentScreenshots;
            return this;
        }
        public Builder consentContentScreenshots(@Nullable List<ImageArgs> consentContentScreenshots) {
            this.consentContentScreenshots = Codegen.ofNullable(consentContentScreenshots);
            return this;
        }
        public Builder consentContentScreenshots(ImageArgs... consentContentScreenshots) {
            return consentContentScreenshots(List.of(consentContentScreenshots));
        }
        public Builder consentContentVersion(@Nullable Output<String> consentContentVersion) {
            this.consentContentVersion = consentContentVersion;
            return this;
        }
        public Builder consentContentVersion(@Nullable String consentContentVersion) {
            this.consentContentVersion = Codegen.ofNullable(consentContentVersion);
            return this;
        }
        public Builder consentStoreId(Output<String> consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }
        public Builder consentStoreId(String consentStoreId) {
            this.consentStoreId = Output.of(Objects.requireNonNull(consentStoreId));
            return this;
        }
        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder guardianSignature(@Nullable Output<SignatureArgs> guardianSignature) {
            this.guardianSignature = guardianSignature;
            return this;
        }
        public Builder guardianSignature(@Nullable SignatureArgs guardianSignature) {
            this.guardianSignature = Codegen.ofNullable(guardianSignature);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder userId(Output<String> userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Output.of(Objects.requireNonNull(userId));
            return this;
        }
        public Builder userSignature(@Nullable Output<SignatureArgs> userSignature) {
            this.userSignature = userSignature;
            return this;
        }
        public Builder userSignature(@Nullable SignatureArgs userSignature) {
            this.userSignature = Codegen.ofNullable(userSignature);
            return this;
        }
        public Builder witnessSignature(@Nullable Output<SignatureArgs> witnessSignature) {
            this.witnessSignature = witnessSignature;
            return this;
        }
        public Builder witnessSignature(@Nullable SignatureArgs witnessSignature) {
            this.witnessSignature = Codegen.ofNullable(witnessSignature);
            return this;
        }        public ConsentArtifactArgs build() {
            return new ConsentArtifactArgs(consentContentScreenshots, consentContentVersion, consentStoreId, datasetId, guardianSignature, location, metadata, name, project, userId, userSignature, witnessSignature);
        }
    }
}
