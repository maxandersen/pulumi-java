// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A SourceContext referring to a Gerrit project.
 * 
 */
public final class GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs Empty = new GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs();

    /**
     * An alias, which may be a branch or tag.
     * 
     */
    @Import(name="aliasContext")
      private final @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs> aliasContext;

    public Output<GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs> aliasContext() {
        return this.aliasContext == null ? Codegen.empty() : this.aliasContext;
    }

    /**
     * The full project name within the host. Projects may be nested, so &#34;project/subproject&#34; is a valid project name. The &#34;repo name&#34; is the hostURI/project.
     * 
     */
    @Import(name="gerritProject")
      private final @Nullable Output<String> gerritProject;

    public Output<String> gerritProject() {
        return this.gerritProject == null ? Codegen.empty() : this.gerritProject;
    }

    /**
     * The URI of a running Gerrit instance.
     * 
     */
    @Import(name="hostUri")
      private final @Nullable Output<String> hostUri;

    public Output<String> hostUri() {
        return this.hostUri == null ? Codegen.empty() : this.hostUri;
    }

    /**
     * A revision (commit) ID.
     * 
     */
    @Import(name="revisionId")
      private final @Nullable Output<String> revisionId;

    public Output<String> revisionId() {
        return this.revisionId == null ? Codegen.empty() : this.revisionId;
    }

    public GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs(
        @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs> aliasContext,
        @Nullable Output<String> gerritProject,
        @Nullable Output<String> hostUri,
        @Nullable Output<String> revisionId) {
        this.aliasContext = aliasContext;
        this.gerritProject = gerritProject;
        this.hostUri = hostUri;
        this.revisionId = revisionId;
    }

    private GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs() {
        this.aliasContext = Codegen.empty();
        this.gerritProject = Codegen.empty();
        this.hostUri = Codegen.empty();
        this.revisionId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs> aliasContext;
        private @Nullable Output<String> gerritProject;
        private @Nullable Output<String> hostUri;
        private @Nullable Output<String> revisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasContext = defaults.aliasContext;
    	      this.gerritProject = defaults.gerritProject;
    	      this.hostUri = defaults.hostUri;
    	      this.revisionId = defaults.revisionId;
        }

        public Builder aliasContext(@Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs> aliasContext) {
            this.aliasContext = aliasContext;
            return this;
        }
        public Builder aliasContext(@Nullable GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs aliasContext) {
            this.aliasContext = Codegen.ofNullable(aliasContext);
            return this;
        }
        public Builder gerritProject(@Nullable Output<String> gerritProject) {
            this.gerritProject = gerritProject;
            return this;
        }
        public Builder gerritProject(@Nullable String gerritProject) {
            this.gerritProject = Codegen.ofNullable(gerritProject);
            return this;
        }
        public Builder hostUri(@Nullable Output<String> hostUri) {
            this.hostUri = hostUri;
            return this;
        }
        public Builder hostUri(@Nullable String hostUri) {
            this.hostUri = Codegen.ofNullable(hostUri);
            return this;
        }
        public Builder revisionId(@Nullable Output<String> revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public Builder revisionId(@Nullable String revisionId) {
            this.revisionId = Codegen.ofNullable(revisionId);
            return this;
        }        public GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs(aliasContext, gerritProject, hostUri, revisionId);
        }
    }
}
