// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact;

import com.pulumi.aws.codeartifact.inputs.RepositoryExternalConnectionsArgs;
import com.pulumi.aws.codeartifact.inputs.RepositoryUpstreamArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryArgs Empty = new RepositoryArgs();

    /**
     * The description of the repository.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The domain that contains the created repository.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The account number of the AWS account that owns the domain.
     * 
     */
    @Import(name="domainOwner")
    private @Nullable Output<String> domainOwner;

    public Optional<Output<String>> domainOwner() {
        return Optional.ofNullable(this.domainOwner);
    }

    /**
     * An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
     * 
     */
    @Import(name="externalConnections")
    private @Nullable Output<RepositoryExternalConnectionsArgs> externalConnections;

    public Optional<Output<RepositoryExternalConnectionsArgs>> externalConnections() {
        return Optional.ofNullable(this.externalConnections);
    }

    /**
     * The name of the repository to create.
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    public Output<String> repository() {
        return this.repository;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
     * 
     */
    @Import(name="upstreams")
    private @Nullable Output<List<RepositoryUpstreamArgs>> upstreams;

    public Optional<Output<List<RepositoryUpstreamArgs>>> upstreams() {
        return Optional.ofNullable(this.upstreams);
    }

    private RepositoryArgs() {}

    private RepositoryArgs(RepositoryArgs $) {
        this.description = $.description;
        this.domain = $.domain;
        this.domainOwner = $.domainOwner;
        this.externalConnections = $.externalConnections;
        this.repository = $.repository;
        this.tags = $.tags;
        this.upstreams = $.upstreams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryArgs $;

        public Builder() {
            $ = new RepositoryArgs();
        }

        public Builder(RepositoryArgs defaults) {
            $ = new RepositoryArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public Builder domainOwner(@Nullable Output<String> domainOwner) {
            $.domainOwner = domainOwner;
            return this;
        }

        public Builder domainOwner(String domainOwner) {
            return domainOwner(Output.of(domainOwner));
        }

        public Builder externalConnections(@Nullable Output<RepositoryExternalConnectionsArgs> externalConnections) {
            $.externalConnections = externalConnections;
            return this;
        }

        public Builder externalConnections(RepositoryExternalConnectionsArgs externalConnections) {
            return externalConnections(Output.of(externalConnections));
        }

        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder upstreams(@Nullable Output<List<RepositoryUpstreamArgs>> upstreams) {
            $.upstreams = upstreams;
            return this;
        }

        public Builder upstreams(List<RepositoryUpstreamArgs> upstreams) {
            return upstreams(Output.of(upstreams));
        }

        public Builder upstreams(RepositoryUpstreamArgs... upstreams) {
            return upstreams(List.of(upstreams));
        }

        public RepositoryArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            return $;
        }
    }

}
