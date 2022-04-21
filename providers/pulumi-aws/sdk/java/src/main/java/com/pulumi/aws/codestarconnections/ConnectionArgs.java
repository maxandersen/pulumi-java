// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codestarconnections;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * The Amazon Resource Name (ARN) of the host associated with the connection. Conflicts with `provider_type`
     * 
     */
    @Import(name="hostArn")
    private @Nullable Output<String> hostArn;

    public Optional<Output<String>> hostArn() {
        return Optional.ofNullable(this.hostArn);
    }

    /**
     * The name of the connection to be created. The name must be unique in the calling AWS account. Changing `name` will create a new resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the external provider where your third-party code repository is configured. Valid values are `Bitbucket`, `GitHub` or `GitHubEnterpriseServer`. Changing `provider_type` will create a new resource. Conflicts with `host_arn`
     * 
     */
    @Import(name="providerType")
    private @Nullable Output<String> providerType;

    public Optional<Output<String>> providerType() {
        return Optional.ofNullable(this.providerType);
    }

    /**
     * Map of key-value resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ConnectionArgs() {}

    private ConnectionArgs(ConnectionArgs $) {
        this.hostArn = $.hostArn;
        this.name = $.name;
        this.providerType = $.providerType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionArgs $;

        public Builder() {
            $ = new ConnectionArgs();
        }

        public Builder(ConnectionArgs defaults) {
            $ = new ConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder hostArn(@Nullable Output<String> hostArn) {
            $.hostArn = hostArn;
            return this;
        }

        public Builder hostArn(String hostArn) {
            return hostArn(Output.of(hostArn));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder providerType(@Nullable Output<String> providerType) {
            $.providerType = providerType;
            return this;
        }

        public Builder providerType(String providerType) {
            return providerType(Output.of(providerType));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ConnectionArgs build() {
            return $;
        }
    }

}
