// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class RepoSourceResponse {
    /**
     * Regex matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private final String branchName;
    /**
     * Explicit commit SHA to build.
     * 
     */
    private final String commitSha;
    /**
     * Directory, relative to the source root, in which to run the build. This must be a relative path. If a step's `dir` is specified and is an absolute path, this value is ignored for that step's execution.
     * 
     */
    private final String dir;
    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    private final Boolean invertRegex;
    /**
     * ID of the project that owns the Cloud Source Repository. If omitted, the project ID requesting the build is assumed.
     * 
     */
    private final String project;
    /**
     * Name of the Cloud Source Repository.
     * 
     */
    private final String repoName;
    /**
     * Substitutions to use in a triggered build. Should only be used with RunBuildTrigger
     * 
     */
    private final Map<String,String> substitutions;
    /**
     * Regex matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private final String tagName;

    @CustomType.Constructor
    private RepoSourceResponse(
        @CustomType.Parameter("branchName") String branchName,
        @CustomType.Parameter("commitSha") String commitSha,
        @CustomType.Parameter("dir") String dir,
        @CustomType.Parameter("invertRegex") Boolean invertRegex,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("repoName") String repoName,
        @CustomType.Parameter("substitutions") Map<String,String> substitutions,
        @CustomType.Parameter("tagName") String tagName) {
        this.branchName = branchName;
        this.commitSha = commitSha;
        this.dir = dir;
        this.invertRegex = invertRegex;
        this.project = project;
        this.repoName = repoName;
        this.substitutions = substitutions;
        this.tagName = tagName;
    }

    /**
     * Regex matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
    */
    public String branchName() {
        return this.branchName;
    }
    /**
     * Explicit commit SHA to build.
     * 
    */
    public String commitSha() {
        return this.commitSha;
    }
    /**
     * Directory, relative to the source root, in which to run the build. This must be a relative path. If a step's `dir` is specified and is an absolute path, this value is ignored for that step's execution.
     * 
    */
    public String dir() {
        return this.dir;
    }
    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
    */
    public Boolean invertRegex() {
        return this.invertRegex;
    }
    /**
     * ID of the project that owns the Cloud Source Repository. If omitted, the project ID requesting the build is assumed.
     * 
    */
    public String project() {
        return this.project;
    }
    /**
     * Name of the Cloud Source Repository.
     * 
    */
    public String repoName() {
        return this.repoName;
    }
    /**
     * Substitutions to use in a triggered build. Should only be used with RunBuildTrigger
     * 
    */
    public Map<String,String> substitutions() {
        return this.substitutions;
    }
    /**
     * Regex matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
    */
    public String tagName() {
        return this.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepoSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String branchName;
        private String commitSha;
        private String dir;
        private Boolean invertRegex;
        private String project;
        private String repoName;
        private Map<String,String> substitutions;
        private String tagName;

        public Builder() {
    	      // Empty
        }

        public Builder(RepoSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.commitSha = defaults.commitSha;
    	      this.dir = defaults.dir;
    	      this.invertRegex = defaults.invertRegex;
    	      this.project = defaults.project;
    	      this.repoName = defaults.repoName;
    	      this.substitutions = defaults.substitutions;
    	      this.tagName = defaults.tagName;
        }

        public Builder branchName(String branchName) {
            this.branchName = Objects.requireNonNull(branchName);
            return this;
        }
        public Builder commitSha(String commitSha) {
            this.commitSha = Objects.requireNonNull(commitSha);
            return this;
        }
        public Builder dir(String dir) {
            this.dir = Objects.requireNonNull(dir);
            return this;
        }
        public Builder invertRegex(Boolean invertRegex) {
            this.invertRegex = Objects.requireNonNull(invertRegex);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder repoName(String repoName) {
            this.repoName = Objects.requireNonNull(repoName);
            return this;
        }
        public Builder substitutions(Map<String,String> substitutions) {
            this.substitutions = Objects.requireNonNull(substitutions);
            return this;
        }
        public Builder tagName(String tagName) {
            this.tagName = Objects.requireNonNull(tagName);
            return this;
        }        public RepoSourceResponse build() {
            return new RepoSourceResponse(branchName, commitSha, dir, invertRegex, project, repoName, substitutions, tagName);
        }
    }
}
