// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A unique identifier for a Cloud Repo.
 * 
 */
public final class GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs Empty = new GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs();

    /**
     * A combination of a project ID and a repo name.
     * 
     */
    @Import(name="projectRepoId")
    private @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs> projectRepoId;

    /**
     * @return A combination of a project ID and a repo name.
     * 
     */
    public Optional<Output<GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs>> projectRepoId() {
        return Optional.ofNullable(this.projectRepoId);
    }

    /**
     * A server-assigned, globally unique identifier.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return A server-assigned, globally unique identifier.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    private GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs() {}

    private GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs(GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs $) {
        this.projectRepoId = $.projectRepoId;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs $;

        public Builder() {
            $ = new GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs();
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs defaults) {
            $ = new GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectRepoId A combination of a project ID and a repo name.
         * 
         * @return builder
         * 
         */
        public Builder projectRepoId(@Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs> projectRepoId) {
            $.projectRepoId = projectRepoId;
            return this;
        }

        /**
         * @param projectRepoId A combination of a project ID and a repo name.
         * 
         * @return builder
         * 
         */
        public Builder projectRepoId(GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs projectRepoId) {
            return projectRepoId(Output.of(projectRepoId));
        }

        /**
         * @param uid A server-assigned, globally unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid A server-assigned, globally unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs build() {
            return $;
        }
    }

}
