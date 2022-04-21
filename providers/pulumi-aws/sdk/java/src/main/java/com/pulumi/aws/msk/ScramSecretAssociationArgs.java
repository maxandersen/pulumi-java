// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ScramSecretAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScramSecretAssociationArgs Empty = new ScramSecretAssociationArgs();

    /**
     * Amazon Resource Name (ARN) of the MSK cluster.
     * 
     */
    @Import(name="clusterArn", required=true)
    private Output<String> clusterArn;

    public Output<String> clusterArn() {
        return this.clusterArn;
    }

    /**
     * List of AWS Secrets Manager secret ARNs.
     * 
     */
    @Import(name="secretArnLists", required=true)
    private Output<List<String>> secretArnLists;

    public Output<List<String>> secretArnLists() {
        return this.secretArnLists;
    }

    private ScramSecretAssociationArgs() {}

    private ScramSecretAssociationArgs(ScramSecretAssociationArgs $) {
        this.clusterArn = $.clusterArn;
        this.secretArnLists = $.secretArnLists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScramSecretAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScramSecretAssociationArgs $;

        public Builder() {
            $ = new ScramSecretAssociationArgs();
        }

        public Builder(ScramSecretAssociationArgs defaults) {
            $ = new ScramSecretAssociationArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterArn(Output<String> clusterArn) {
            $.clusterArn = clusterArn;
            return this;
        }

        public Builder clusterArn(String clusterArn) {
            return clusterArn(Output.of(clusterArn));
        }

        public Builder secretArnLists(Output<List<String>> secretArnLists) {
            $.secretArnLists = secretArnLists;
            return this;
        }

        public Builder secretArnLists(List<String> secretArnLists) {
            return secretArnLists(Output.of(secretArnLists));
        }

        public Builder secretArnLists(String... secretArnLists) {
            return secretArnLists(List.of(secretArnLists));
        }

        public ScramSecretAssociationArgs build() {
            $.clusterArn = Objects.requireNonNull($.clusterArn, "expected parameter 'clusterArn' to be non-null");
            $.secretArnLists = Objects.requireNonNull($.secretArnLists, "expected parameter 'secretArnLists' to be non-null");
            return $;
        }
    }

}
