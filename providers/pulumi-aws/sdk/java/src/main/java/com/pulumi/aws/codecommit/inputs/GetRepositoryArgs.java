// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecommit.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRepositoryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryArgs Empty = new GetRepositoryArgs();

    /**
     * The name for the repository. This needs to be less than 100 characters.
     * 
     */
    @Import(name="repositoryName", required=true)
    private String repositoryName;

    /**
     * @return The name for the repository. This needs to be less than 100 characters.
     * 
     */
    public String repositoryName() {
        return this.repositoryName;
    }

    private GetRepositoryArgs() {}

    private GetRepositoryArgs(GetRepositoryArgs $) {
        this.repositoryName = $.repositoryName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryArgs $;

        public Builder() {
            $ = new GetRepositoryArgs();
        }

        public Builder(GetRepositoryArgs defaults) {
            $ = new GetRepositoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param repositoryName The name for the repository. This needs to be less than 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(String repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        public GetRepositoryArgs build() {
            $.repositoryName = Objects.requireNonNull($.repositoryName, "expected parameter 'repositoryName' to be non-null");
            return $;
        }
    }

}
