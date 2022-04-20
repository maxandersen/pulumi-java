// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.healthcare_v1.enums.ConsentState;
import com.pulumi.googlenative.healthcare_v1.inputs.GoogleCloudHealthcareV1ConsentPolicyArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConsentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConsentArgs Empty = new ConsentArgs();

    /**
     * The resource name of the Consent artifact that contains proof of the end user&#39;s consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
     * 
     */
    @Import(name="consentArtifact", required=true)
      private final Output<String> consentArtifact;

    public Output<String> consentArtifact() {
        return this.consentArtifact;
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
     * Timestamp in UTC of when this Consent is considered expired.
     * 
     */
    @Import(name="expireTime")
      private final @Nullable Output<String> expireTime;

    public Output<String> expireTime() {
        return this.expireTime == null ? Codegen.empty() : this.expireTime;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Resource name of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`. Cannot be changed after creation.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Optional. Represents a user&#39;s consent in terms of the resources that can be accessed and under what conditions.
     * 
     */
    @Import(name="policies")
      private final @Nullable Output<List<GoogleCloudHealthcareV1ConsentPolicyArgs>> policies;

    public Output<List<GoogleCloudHealthcareV1ConsentPolicyArgs>> policies() {
        return this.policies == null ? Codegen.empty() : this.policies;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Indicates the current state of this Consent.
     * 
     */
    @Import(name="state", required=true)
      private final Output<ConsentState> state;

    public Output<ConsentState> state() {
        return this.state;
    }

    /**
     * Input only. The time to live for this Consent from when it is created.
     * 
     */
    @Import(name="ttl")
      private final @Nullable Output<String> ttl;

    public Output<String> ttl() {
        return this.ttl == null ? Codegen.empty() : this.ttl;
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

    public ConsentArgs(
        Output<String> consentArtifact,
        Output<String> consentStoreId,
        Output<String> datasetId,
        @Nullable Output<String> expireTime,
        @Nullable Output<String> location,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> name,
        @Nullable Output<List<GoogleCloudHealthcareV1ConsentPolicyArgs>> policies,
        @Nullable Output<String> project,
        Output<ConsentState> state,
        @Nullable Output<String> ttl,
        Output<String> userId) {
        this.consentArtifact = Objects.requireNonNull(consentArtifact, "expected parameter 'consentArtifact' to be non-null");
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.expireTime = expireTime;
        this.location = location;
        this.metadata = metadata;
        this.name = name;
        this.policies = policies;
        this.project = project;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.ttl = ttl;
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private ConsentArgs() {
        this.consentArtifact = Codegen.empty();
        this.consentStoreId = Codegen.empty();
        this.datasetId = Codegen.empty();
        this.expireTime = Codegen.empty();
        this.location = Codegen.empty();
        this.metadata = Codegen.empty();
        this.name = Codegen.empty();
        this.policies = Codegen.empty();
        this.project = Codegen.empty();
        this.state = Codegen.empty();
        this.ttl = Codegen.empty();
        this.userId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> consentArtifact;
        private Output<String> consentStoreId;
        private Output<String> datasetId;
        private @Nullable Output<String> expireTime;
        private @Nullable Output<String> location;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> name;
        private @Nullable Output<List<GoogleCloudHealthcareV1ConsentPolicyArgs>> policies;
        private @Nullable Output<String> project;
        private Output<ConsentState> state;
        private @Nullable Output<String> ttl;
        private Output<String> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentArtifact = defaults.consentArtifact;
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.datasetId = defaults.datasetId;
    	      this.expireTime = defaults.expireTime;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.policies = defaults.policies;
    	      this.project = defaults.project;
    	      this.state = defaults.state;
    	      this.ttl = defaults.ttl;
    	      this.userId = defaults.userId;
        }

        public Builder consentArtifact(Output<String> consentArtifact) {
            this.consentArtifact = Objects.requireNonNull(consentArtifact);
            return this;
        }
        public Builder consentArtifact(String consentArtifact) {
            this.consentArtifact = Output.of(Objects.requireNonNull(consentArtifact));
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
        public Builder expireTime(@Nullable Output<String> expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Builder expireTime(@Nullable String expireTime) {
            this.expireTime = Codegen.ofNullable(expireTime);
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
        public Builder policies(@Nullable Output<List<GoogleCloudHealthcareV1ConsentPolicyArgs>> policies) {
            this.policies = policies;
            return this;
        }
        public Builder policies(@Nullable List<GoogleCloudHealthcareV1ConsentPolicyArgs> policies) {
            this.policies = Codegen.ofNullable(policies);
            return this;
        }
        public Builder policies(GoogleCloudHealthcareV1ConsentPolicyArgs... policies) {
            return policies(List.of(policies));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder state(Output<ConsentState> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder state(ConsentState state) {
            this.state = Output.of(Objects.requireNonNull(state));
            return this;
        }
        public Builder ttl(@Nullable Output<String> ttl) {
            this.ttl = ttl;
            return this;
        }
        public Builder ttl(@Nullable String ttl) {
            this.ttl = Codegen.ofNullable(ttl);
            return this;
        }
        public Builder userId(Output<String> userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Output.of(Objects.requireNonNull(userId));
            return this;
        }        public ConsentArgs build() {
            return new ConsentArgs(consentArtifact, consentStoreId, datasetId, expireTime, location, metadata, name, policies, project, state, ttl, userId);
        }
    }
}
