// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.AliasContextResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A SourceContext referring to a Gerrit project.
 * 
 */
public final class GerritSourceContextResponse extends com.pulumi.resources.InvokeArgs {

    public static final GerritSourceContextResponse Empty = new GerritSourceContextResponse();

    /**
     * An alias, which may be a branch or tag.
     * 
     */
    @Import(name="aliasContext", required=true)
      private final AliasContextResponse aliasContext;

    public AliasContextResponse aliasContext() {
        return this.aliasContext;
    }

    /**
     * The full project name within the host. Projects may be nested, so "project/subproject" is a valid project name. The "repo name" is the hostURI/project.
     * 
     */
    @Import(name="gerritProject", required=true)
      private final String gerritProject;

    public String gerritProject() {
        return this.gerritProject;
    }

    /**
     * The URI of a running Gerrit instance.
     * 
     */
    @Import(name="hostUri", required=true)
      private final String hostUri;

    public String hostUri() {
        return this.hostUri;
    }

    /**
     * A revision (commit) ID.
     * 
     */
    @Import(name="revisionId", required=true)
      private final String revisionId;

    public String revisionId() {
        return this.revisionId;
    }

    public GerritSourceContextResponse(
        AliasContextResponse aliasContext,
        String gerritProject,
        String hostUri,
        String revisionId) {
        this.aliasContext = Objects.requireNonNull(aliasContext, "expected parameter 'aliasContext' to be non-null");
        this.gerritProject = Objects.requireNonNull(gerritProject, "expected parameter 'gerritProject' to be non-null");
        this.hostUri = Objects.requireNonNull(hostUri, "expected parameter 'hostUri' to be non-null");
        this.revisionId = Objects.requireNonNull(revisionId, "expected parameter 'revisionId' to be non-null");
    }

    private GerritSourceContextResponse() {
        this.aliasContext = null;
        this.gerritProject = null;
        this.hostUri = null;
        this.revisionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GerritSourceContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasContextResponse aliasContext;
        private String gerritProject;
        private String hostUri;
        private String revisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GerritSourceContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasContext = defaults.aliasContext;
    	      this.gerritProject = defaults.gerritProject;
    	      this.hostUri = defaults.hostUri;
    	      this.revisionId = defaults.revisionId;
        }

        public Builder aliasContext(AliasContextResponse aliasContext) {
            this.aliasContext = Objects.requireNonNull(aliasContext);
            return this;
        }
        public Builder gerritProject(String gerritProject) {
            this.gerritProject = Objects.requireNonNull(gerritProject);
            return this;
        }
        public Builder hostUri(String hostUri) {
            this.hostUri = Objects.requireNonNull(hostUri);
            return this;
        }
        public Builder revisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }        public GerritSourceContextResponse build() {
            return new GerritSourceContextResponse(aliasContext, gerritProject, hostUri, revisionId);
        }
    }
}
