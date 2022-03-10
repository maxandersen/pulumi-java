// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.secretmanager_v1beta1.outputs.ReplicationResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetSecretResult {
    /**
     * The time at which the Secret was created.
     * 
     */
    private final String createTime;
    /**
     * The labels assigned to this Secret. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `\p{Ll}\p{Lo}{0,62}` Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}` No more than 64 labels can be assigned to a given resource.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource name of the Secret in the format `projects/*{@literal /}secrets/*`.
     * 
     */
    private final String name;
    /**
     * Immutable. The replication policy of the secret data attached to the Secret. The replication policy cannot be changed after the Secret has been created.
     * 
     */
    private final ReplicationResponse replication;

    @OutputCustomType.Constructor
    private GetSecretResult(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("replication") ReplicationResponse replication) {
        this.createTime = createTime;
        this.labels = labels;
        this.name = name;
        this.replication = replication;
    }

    /**
     * The time at which the Secret was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The labels assigned to this Secret. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `\p{Ll}\p{Lo}{0,62}` Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}` No more than 64 labels can be assigned to a given resource.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the Secret in the format `projects/*{@literal /}secrets/*`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Immutable. The replication policy of the secret data attached to the Secret. The replication policy cannot be changed after the Secret has been created.
     * 
    */
    public ReplicationResponse getReplication() {
        return this.replication;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private Map<String,String> labels;
        private String name;
        private ReplicationResponse replication;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.replication = defaults.replication;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReplication(ReplicationResponse replication) {
            this.replication = Objects.requireNonNull(replication);
            return this;
        }
        public GetSecretResult build() {
            return new GetSecretResult(createTime, labels, name, replication);
        }
    }
}
