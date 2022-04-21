// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs;
import com.pulumi.gcp.secretmanager.inputs.SecretRotationArgs;
import com.pulumi.gcp.secretmanager.inputs.SecretTopicArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * Timestamp in UTC when the Secret is scheduled to expire. This is always provided on output, regardless of what was sent on input.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="expireTime")
    private @Nullable Output<String> expireTime;

    public Optional<Output<String>> expireTime() {
        return Optional.ofNullable(this.expireTime);
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
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The replication policy of the secret data attached to the Secret. It cannot be changed
     * after the Secret has been created.
     * Structure is documented below.
     * 
     */
    @Import(name="replication", required=true)
    private Output<SecretReplicationArgs> replication;

    public Output<SecretReplicationArgs> replication() {
        return this.replication;
    }

    /**
     * The rotation time and period for a Secret. At `next_rotation_time`, Secret Manager will send a Pub/Sub notification to the topics configured on the Secret. `topics` must be set to configure rotation.
     * Structure is documented below.
     * 
     */
    @Import(name="rotation")
    private @Nullable Output<SecretRotationArgs> rotation;

    public Optional<Output<SecretRotationArgs>> rotation() {
        return Optional.ofNullable(this.rotation);
    }

    /**
     * This must be unique within the project.
     * 
     */
    @Import(name="secretId", required=true)
    private Output<String> secretId;

    public Output<String> secretId() {
        return this.secretId;
    }

    /**
     * A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     * Structure is documented below.
     * 
     */
    @Import(name="topics")
    private @Nullable Output<List<SecretTopicArgs>> topics;

    public Optional<Output<List<SecretTopicArgs>>> topics() {
        return Optional.ofNullable(this.topics);
    }

    /**
     * The TTL for the Secret.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<String> ttl;

    public Optional<Output<String>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    private SecretArgs() {}

    private SecretArgs(SecretArgs $) {
        this.expireTime = $.expireTime;
        this.labels = $.labels;
        this.project = $.project;
        this.replication = $.replication;
        this.rotation = $.rotation;
        this.secretId = $.secretId;
        this.topics = $.topics;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretArgs $;

        public Builder() {
            $ = new SecretArgs();
        }

        public Builder(SecretArgs defaults) {
            $ = new SecretArgs(Objects.requireNonNull(defaults));
        }

        public Builder expireTime(@Nullable Output<String> expireTime) {
            $.expireTime = expireTime;
            return this;
        }

        public Builder expireTime(String expireTime) {
            return expireTime(Output.of(expireTime));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder replication(Output<SecretReplicationArgs> replication) {
            $.replication = replication;
            return this;
        }

        public Builder replication(SecretReplicationArgs replication) {
            return replication(Output.of(replication));
        }

        public Builder rotation(@Nullable Output<SecretRotationArgs> rotation) {
            $.rotation = rotation;
            return this;
        }

        public Builder rotation(SecretRotationArgs rotation) {
            return rotation(Output.of(rotation));
        }

        public Builder secretId(Output<String> secretId) {
            $.secretId = secretId;
            return this;
        }

        public Builder secretId(String secretId) {
            return secretId(Output.of(secretId));
        }

        public Builder topics(@Nullable Output<List<SecretTopicArgs>> topics) {
            $.topics = topics;
            return this;
        }

        public Builder topics(List<SecretTopicArgs> topics) {
            return topics(Output.of(topics));
        }

        public Builder topics(SecretTopicArgs... topics) {
            return topics(List.of(topics));
        }

        public Builder ttl(@Nullable Output<String> ttl) {
            $.ttl = ttl;
            return this;
        }

        public Builder ttl(String ttl) {
            return ttl(Output.of(ttl));
        }

        public SecretArgs build() {
            $.replication = Objects.requireNonNull($.replication, "expected parameter 'replication' to be non-null");
            $.secretId = Objects.requireNonNull($.secretId, "expected parameter 'secretId' to be non-null");
            return $;
        }
    }

}
