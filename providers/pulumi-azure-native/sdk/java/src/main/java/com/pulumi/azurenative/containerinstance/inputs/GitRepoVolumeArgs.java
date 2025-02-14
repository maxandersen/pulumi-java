// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a volume that is populated with the contents of a git repository
 * 
 */
public final class GitRepoVolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitRepoVolumeArgs Empty = new GitRepoVolumeArgs();

    /**
     * Target directory name. Must not contain or start with &#39;..&#39;.  If &#39;.&#39; is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
     * 
     */
    @Import(name="directory")
    private @Nullable Output<String> directory;

    /**
     * @return Target directory name. Must not contain or start with &#39;..&#39;.  If &#39;.&#39; is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
     * 
     */
    public Optional<Output<String>> directory() {
        return Optional.ofNullable(this.directory);
    }

    /**
     * Repository URL
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    /**
     * @return Repository URL
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }

    /**
     * Commit hash for the specified revision.
     * 
     */
    @Import(name="revision")
    private @Nullable Output<String> revision;

    /**
     * @return Commit hash for the specified revision.
     * 
     */
    public Optional<Output<String>> revision() {
        return Optional.ofNullable(this.revision);
    }

    private GitRepoVolumeArgs() {}

    private GitRepoVolumeArgs(GitRepoVolumeArgs $) {
        this.directory = $.directory;
        this.repository = $.repository;
        this.revision = $.revision;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitRepoVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitRepoVolumeArgs $;

        public Builder() {
            $ = new GitRepoVolumeArgs();
        }

        public Builder(GitRepoVolumeArgs defaults) {
            $ = new GitRepoVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param directory Target directory name. Must not contain or start with &#39;..&#39;.  If &#39;.&#39; is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
         * 
         * @return builder
         * 
         */
        public Builder directory(@Nullable Output<String> directory) {
            $.directory = directory;
            return this;
        }

        /**
         * @param directory Target directory name. Must not contain or start with &#39;..&#39;.  If &#39;.&#39; is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
         * 
         * @return builder
         * 
         */
        public Builder directory(String directory) {
            return directory(Output.of(directory));
        }

        /**
         * @param repository Repository URL
         * 
         * @return builder
         * 
         */
        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository Repository URL
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        /**
         * @param revision Commit hash for the specified revision.
         * 
         * @return builder
         * 
         */
        public Builder revision(@Nullable Output<String> revision) {
            $.revision = revision;
            return this;
        }

        /**
         * @param revision Commit hash for the specified revision.
         * 
         * @return builder
         * 
         */
        public Builder revision(String revision) {
            return revision(Output.of(revision));
        }

        public GitRepoVolumeArgs build() {
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            return $;
        }
    }

}
