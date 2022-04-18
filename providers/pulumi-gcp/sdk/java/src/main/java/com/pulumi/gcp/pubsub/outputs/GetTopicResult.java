// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.pubsub.outputs.GetTopicMessageStoragePolicy;
import com.pulumi.gcp.pubsub.outputs.GetTopicSchemaSetting;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTopicResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String kmsKeyName;
    private final Map<String,String> labels;
    private final String messageRetentionDuration;
    private final List<GetTopicMessageStoragePolicy> messageStoragePolicies;
    private final String name;
    private final @Nullable String project;
    private final List<GetTopicSchemaSetting> schemaSettings;

    @CustomType.Constructor
    private GetTopicResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kmsKeyName") String kmsKeyName,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("messageRetentionDuration") String messageRetentionDuration,
        @CustomType.Parameter("messageStoragePolicies") List<GetTopicMessageStoragePolicy> messageStoragePolicies,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("schemaSettings") List<GetTopicSchemaSetting> schemaSettings) {
        this.id = id;
        this.kmsKeyName = kmsKeyName;
        this.labels = labels;
        this.messageRetentionDuration = messageRetentionDuration;
        this.messageStoragePolicies = messageStoragePolicies;
        this.name = name;
        this.project = project;
        this.schemaSettings = schemaSettings;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public String messageRetentionDuration() {
        return this.messageRetentionDuration;
    }
    public List<GetTopicMessageStoragePolicy> messageStoragePolicies() {
        return this.messageStoragePolicies;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public List<GetTopicSchemaSetting> schemaSettings() {
        return this.schemaSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String kmsKeyName;
        private Map<String,String> labels;
        private String messageRetentionDuration;
        private List<GetTopicMessageStoragePolicy> messageStoragePolicies;
        private String name;
        private @Nullable String project;
        private List<GetTopicSchemaSetting> schemaSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTopicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.messageRetentionDuration = defaults.messageRetentionDuration;
    	      this.messageStoragePolicies = defaults.messageStoragePolicies;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.schemaSettings = defaults.schemaSettings;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder messageRetentionDuration(String messageRetentionDuration) {
            this.messageRetentionDuration = Objects.requireNonNull(messageRetentionDuration);
            return this;
        }
        public Builder messageStoragePolicies(List<GetTopicMessageStoragePolicy> messageStoragePolicies) {
            this.messageStoragePolicies = Objects.requireNonNull(messageStoragePolicies);
            return this;
        }
        public Builder messageStoragePolicies(GetTopicMessageStoragePolicy... messageStoragePolicies) {
            return messageStoragePolicies(List.of(messageStoragePolicies));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder schemaSettings(List<GetTopicSchemaSetting> schemaSettings) {
            this.schemaSettings = Objects.requireNonNull(schemaSettings);
            return this;
        }
        public Builder schemaSettings(GetTopicSchemaSetting... schemaSettings) {
            return schemaSettings(List.of(schemaSettings));
        }        public GetTopicResult build() {
            return new GetTopicResult(id, kmsKeyName, labels, messageRetentionDuration, messageStoragePolicies, name, project, schemaSettings);
        }
    }
}
