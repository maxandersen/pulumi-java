// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepositoryObjectContentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryObjectContentArgs Empty = new GetRepositoryObjectContentArgs();

    /**
     * A filter to return only commits that affect any of the specified paths.
     * 
     */
    @Import(name="filePath")
    private @Nullable String filePath;

    /**
     * @return A filter to return only commits that affect any of the specified paths.
     * 
     */
    public Optional<String> filePath() {
        return Optional.ofNullable(this.filePath);
    }

    /**
     * Unique repository identifier.
     * 
     */
    @Import(name="repositoryId", required=true)
    private String repositoryId;

    /**
     * @return Unique repository identifier.
     * 
     */
    public String repositoryId() {
        return this.repositoryId;
    }

    /**
     * The SHA of a blob or tree.
     * 
     */
    @Import(name="sha", required=true)
    private String sha;

    /**
     * @return The SHA of a blob or tree.
     * 
     */
    public String sha() {
        return this.sha;
    }

    private GetRepositoryObjectContentArgs() {}

    private GetRepositoryObjectContentArgs(GetRepositoryObjectContentArgs $) {
        this.filePath = $.filePath;
        this.repositoryId = $.repositoryId;
        this.sha = $.sha;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryObjectContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryObjectContentArgs $;

        public Builder() {
            $ = new GetRepositoryObjectContentArgs();
        }

        public Builder(GetRepositoryObjectContentArgs defaults) {
            $ = new GetRepositoryObjectContentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filePath A filter to return only commits that affect any of the specified paths.
         * 
         * @return builder
         * 
         */
        public Builder filePath(@Nullable String filePath) {
            $.filePath = filePath;
            return this;
        }

        /**
         * @param repositoryId Unique repository identifier.
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(String repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        /**
         * @param sha The SHA of a blob or tree.
         * 
         * @return builder
         * 
         */
        public Builder sha(String sha) {
            $.sha = sha;
            return this;
        }

        public GetRepositoryObjectContentArgs build() {
            $.repositoryId = Objects.requireNonNull($.repositoryId, "expected parameter 'repositoryId' to be non-null");
            $.sha = Objects.requireNonNull($.sha, "expected parameter 'sha' to be non-null");
            return $;
        }
    }

}
