// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecrpublic.inputs;

import com.pulumi.aws.ecrpublic.inputs.RepositoryCatalogDataGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryState extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryState Empty = new RepositoryState();

    /**
     * Full ARN of the repository.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Catalog data configuration for the repository. See below for schema.
     * 
     */
    @Import(name="catalogData")
    private @Nullable Output<RepositoryCatalogDataGetArgs> catalogData;

    public Optional<Output<RepositoryCatalogDataGetArgs>> catalogData() {
        return Optional.ofNullable(this.catalogData);
    }

    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * The registry ID where the repository was created.
     * 
     */
    @Import(name="registryId")
    private @Nullable Output<String> registryId;

    public Optional<Output<String>> registryId() {
        return Optional.ofNullable(this.registryId);
    }

    /**
     * Name of the repository.
     * 
     */
    @Import(name="repositoryName")
    private @Nullable Output<String> repositoryName;

    public Optional<Output<String>> repositoryName() {
        return Optional.ofNullable(this.repositoryName);
    }

    /**
     * The URI of the repository.
     * 
     */
    @Import(name="repositoryUri")
    private @Nullable Output<String> repositoryUri;

    public Optional<Output<String>> repositoryUri() {
        return Optional.ofNullable(this.repositoryUri);
    }

    private RepositoryState() {}

    private RepositoryState(RepositoryState $) {
        this.arn = $.arn;
        this.catalogData = $.catalogData;
        this.forceDestroy = $.forceDestroy;
        this.registryId = $.registryId;
        this.repositoryName = $.repositoryName;
        this.repositoryUri = $.repositoryUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryState $;

        public Builder() {
            $ = new RepositoryState();
        }

        public Builder(RepositoryState defaults) {
            $ = new RepositoryState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder catalogData(@Nullable Output<RepositoryCatalogDataGetArgs> catalogData) {
            $.catalogData = catalogData;
            return this;
        }

        public Builder catalogData(RepositoryCatalogDataGetArgs catalogData) {
            return catalogData(Output.of(catalogData));
        }

        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        public Builder registryId(@Nullable Output<String> registryId) {
            $.registryId = registryId;
            return this;
        }

        public Builder registryId(String registryId) {
            return registryId(Output.of(registryId));
        }

        public Builder repositoryName(@Nullable Output<String> repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        public Builder repositoryName(String repositoryName) {
            return repositoryName(Output.of(repositoryName));
        }

        public Builder repositoryUri(@Nullable Output<String> repositoryUri) {
            $.repositoryUri = repositoryUri;
            return this;
        }

        public Builder repositoryUri(String repositoryUri) {
            return repositoryUri(Output.of(repositoryUri));
        }

        public RepositoryState build() {
            return $;
        }
    }

}
