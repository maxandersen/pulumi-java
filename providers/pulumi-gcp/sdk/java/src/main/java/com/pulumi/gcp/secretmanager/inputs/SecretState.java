// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.secretmanager.inputs.SecretReplicationGetArgs;
import com.pulumi.gcp.secretmanager.inputs.SecretRotationGetArgs;
import com.pulumi.gcp.secretmanager.inputs.SecretTopicGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretState extends com.pulumi.resources.ResourceArgs {

    public static final SecretState Empty = new SecretState();

    /**
     * The time at which the Secret was created.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * Timestamp in UTC when the Secret is scheduled to expire. This is always provided on output, regardless of what was sent on input.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="expireTime")
      private final @Nullable Output<String> expireTime;

    public Output<String> expireTime() {
        return this.expireTime == null ? Codegen.empty() : this.expireTime;
    }

    /**
     * The labels assigned to this Secret.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
     * and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
     * and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be assigned to a given resource.
     * An object containing a list of &#34;key&#34;: value pairs. Example:
     * { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The resource name of the Pub/Sub topic that will be published to, in the following format: projects/*{@literal /}topics/*.
     * For publication to succeed, the Secret Manager Service Agent service account must have pubsub.publisher permissions on the topic.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The replication policy of the secret data attached to the Secret. It cannot be changed
     * after the Secret has been created.
     * Structure is documented below.
     * 
     */
    @Import(name="replication")
      private final @Nullable Output<SecretReplicationGetArgs> replication;

    public Output<SecretReplicationGetArgs> replication() {
        return this.replication == null ? Codegen.empty() : this.replication;
    }

    /**
     * The rotation time and period for a Secret. At `next_rotation_time`, Secret Manager will send a Pub/Sub notification to the topics configured on the Secret. `topics` must be set to configure rotation.
     * Structure is documented below.
     * 
     */
    @Import(name="rotation")
      private final @Nullable Output<SecretRotationGetArgs> rotation;

    public Output<SecretRotationGetArgs> rotation() {
        return this.rotation == null ? Codegen.empty() : this.rotation;
    }

    /**
     * This must be unique within the project.
     * 
     */
    @Import(name="secretId")
      private final @Nullable Output<String> secretId;

    public Output<String> secretId() {
        return this.secretId == null ? Codegen.empty() : this.secretId;
    }

    /**
     * A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     * Structure is documented below.
     * 
     */
    @Import(name="topics")
      private final @Nullable Output<List<SecretTopicGetArgs>> topics;

    public Output<List<SecretTopicGetArgs>> topics() {
        return this.topics == null ? Codegen.empty() : this.topics;
    }

    /**
     * The TTL for the Secret.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="ttl")
      private final @Nullable Output<String> ttl;

    public Output<String> ttl() {
        return this.ttl == null ? Codegen.empty() : this.ttl;
    }

    public SecretState(
        @Nullable Output<String> createTime,
        @Nullable Output<String> expireTime,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<SecretReplicationGetArgs> replication,
        @Nullable Output<SecretRotationGetArgs> rotation,
        @Nullable Output<String> secretId,
        @Nullable Output<List<SecretTopicGetArgs>> topics,
        @Nullable Output<String> ttl) {
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.replication = replication;
        this.rotation = rotation;
        this.secretId = secretId;
        this.topics = topics;
        this.ttl = ttl;
    }

    private SecretState() {
        this.createTime = Codegen.empty();
        this.expireTime = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.replication = Codegen.empty();
        this.rotation = Codegen.empty();
        this.secretId = Codegen.empty();
        this.topics = Codegen.empty();
        this.ttl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> expireTime;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<SecretReplicationGetArgs> replication;
        private @Nullable Output<SecretRotationGetArgs> rotation;
        private @Nullable Output<String> secretId;
        private @Nullable Output<List<SecretTopicGetArgs>> topics;
        private @Nullable Output<String> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.replication = defaults.replication;
    	      this.rotation = defaults.rotation;
    	      this.secretId = defaults.secretId;
    	      this.topics = defaults.topics;
    	      this.ttl = defaults.ttl;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
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
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
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
        public Builder replication(@Nullable Output<SecretReplicationGetArgs> replication) {
            this.replication = replication;
            return this;
        }
        public Builder replication(@Nullable SecretReplicationGetArgs replication) {
            this.replication = Codegen.ofNullable(replication);
            return this;
        }
        public Builder rotation(@Nullable Output<SecretRotationGetArgs> rotation) {
            this.rotation = rotation;
            return this;
        }
        public Builder rotation(@Nullable SecretRotationGetArgs rotation) {
            this.rotation = Codegen.ofNullable(rotation);
            return this;
        }
        public Builder secretId(@Nullable Output<String> secretId) {
            this.secretId = secretId;
            return this;
        }
        public Builder secretId(@Nullable String secretId) {
            this.secretId = Codegen.ofNullable(secretId);
            return this;
        }
        public Builder topics(@Nullable Output<List<SecretTopicGetArgs>> topics) {
            this.topics = topics;
            return this;
        }
        public Builder topics(@Nullable List<SecretTopicGetArgs> topics) {
            this.topics = Codegen.ofNullable(topics);
            return this;
        }
        public Builder topics(SecretTopicGetArgs... topics) {
            return topics(List.of(topics));
        }
        public Builder ttl(@Nullable Output<String> ttl) {
            this.ttl = ttl;
            return this;
        }
        public Builder ttl(@Nullable String ttl) {
            this.ttl = Codegen.ofNullable(ttl);
            return this;
        }        public SecretState build() {
            return new SecretState(createTime, expireTime, labels, name, project, replication, rotation, secretId, topics, ttl);
        }
    }
}
