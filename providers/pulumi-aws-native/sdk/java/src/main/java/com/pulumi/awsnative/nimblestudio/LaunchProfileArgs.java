// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio;

import com.pulumi.awsnative.nimblestudio.inputs.LaunchProfileStreamConfigurationArgs;
import com.pulumi.awsnative.nimblestudio.inputs.LaunchProfileTagsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LaunchProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final LaunchProfileArgs Empty = new LaunchProfileArgs();

    /**
     * &lt;p&gt;The description.&lt;/p&gt;
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * &lt;p&gt;Specifies the IDs of the EC2 subnets where streaming sessions will be accessible from.
     *             These subnets must support the specified instance types. &lt;/p&gt;
     * 
     */
    @Import(name="ec2SubnetIds", required=true)
    private Output<List<String>> ec2SubnetIds;

    public Output<List<String>> ec2SubnetIds() {
        return this.ec2SubnetIds;
    }

    /**
     * &lt;p&gt;The version number of the protocol that is used by the launch profile. The only valid
     *             version is &#34;2021-03-31&#34;.&lt;/p&gt;
     * 
     */
    @Import(name="launchProfileProtocolVersions", required=true)
    private Output<List<String>> launchProfileProtocolVersions;

    public Output<List<String>> launchProfileProtocolVersions() {
        return this.launchProfileProtocolVersions;
    }

    /**
     * &lt;p&gt;The name for the launch profile.&lt;/p&gt;
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="streamConfiguration", required=true)
    private Output<LaunchProfileStreamConfigurationArgs> streamConfiguration;

    public Output<LaunchProfileStreamConfigurationArgs> streamConfiguration() {
        return this.streamConfiguration;
    }

    /**
     * &lt;p&gt;Unique identifiers for a collection of studio components that can be used with this
     *             launch profile.&lt;/p&gt;
     * 
     */
    @Import(name="studioComponentIds", required=true)
    private Output<List<String>> studioComponentIds;

    public Output<List<String>> studioComponentIds() {
        return this.studioComponentIds;
    }

    /**
     * &lt;p&gt;The studio ID. &lt;/p&gt;
     * 
     */
    @Import(name="studioId", required=true)
    private Output<String> studioId;

    public Output<String> studioId() {
        return this.studioId;
    }

    @Import(name="tags")
    private @Nullable Output<LaunchProfileTagsArgs> tags;

    public Optional<Output<LaunchProfileTagsArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private LaunchProfileArgs() {}

    private LaunchProfileArgs(LaunchProfileArgs $) {
        this.description = $.description;
        this.ec2SubnetIds = $.ec2SubnetIds;
        this.launchProfileProtocolVersions = $.launchProfileProtocolVersions;
        this.name = $.name;
        this.streamConfiguration = $.streamConfiguration;
        this.studioComponentIds = $.studioComponentIds;
        this.studioId = $.studioId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LaunchProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LaunchProfileArgs $;

        public Builder() {
            $ = new LaunchProfileArgs();
        }

        public Builder(LaunchProfileArgs defaults) {
            $ = new LaunchProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder ec2SubnetIds(Output<List<String>> ec2SubnetIds) {
            $.ec2SubnetIds = ec2SubnetIds;
            return this;
        }

        public Builder ec2SubnetIds(List<String> ec2SubnetIds) {
            return ec2SubnetIds(Output.of(ec2SubnetIds));
        }

        public Builder ec2SubnetIds(String... ec2SubnetIds) {
            return ec2SubnetIds(List.of(ec2SubnetIds));
        }

        public Builder launchProfileProtocolVersions(Output<List<String>> launchProfileProtocolVersions) {
            $.launchProfileProtocolVersions = launchProfileProtocolVersions;
            return this;
        }

        public Builder launchProfileProtocolVersions(List<String> launchProfileProtocolVersions) {
            return launchProfileProtocolVersions(Output.of(launchProfileProtocolVersions));
        }

        public Builder launchProfileProtocolVersions(String... launchProfileProtocolVersions) {
            return launchProfileProtocolVersions(List.of(launchProfileProtocolVersions));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder streamConfiguration(Output<LaunchProfileStreamConfigurationArgs> streamConfiguration) {
            $.streamConfiguration = streamConfiguration;
            return this;
        }

        public Builder streamConfiguration(LaunchProfileStreamConfigurationArgs streamConfiguration) {
            return streamConfiguration(Output.of(streamConfiguration));
        }

        public Builder studioComponentIds(Output<List<String>> studioComponentIds) {
            $.studioComponentIds = studioComponentIds;
            return this;
        }

        public Builder studioComponentIds(List<String> studioComponentIds) {
            return studioComponentIds(Output.of(studioComponentIds));
        }

        public Builder studioComponentIds(String... studioComponentIds) {
            return studioComponentIds(List.of(studioComponentIds));
        }

        public Builder studioId(Output<String> studioId) {
            $.studioId = studioId;
            return this;
        }

        public Builder studioId(String studioId) {
            return studioId(Output.of(studioId));
        }

        public Builder tags(@Nullable Output<LaunchProfileTagsArgs> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(LaunchProfileTagsArgs tags) {
            return tags(Output.of(tags));
        }

        public LaunchProfileArgs build() {
            $.ec2SubnetIds = Objects.requireNonNull($.ec2SubnetIds, "expected parameter 'ec2SubnetIds' to be non-null");
            $.launchProfileProtocolVersions = Objects.requireNonNull($.launchProfileProtocolVersions, "expected parameter 'launchProfileProtocolVersions' to be non-null");
            $.streamConfiguration = Objects.requireNonNull($.streamConfiguration, "expected parameter 'streamConfiguration' to be non-null");
            $.studioComponentIds = Objects.requireNonNull($.studioComponentIds, "expected parameter 'studioComponentIds' to be non-null");
            $.studioId = Objects.requireNonNull($.studioId, "expected parameter 'studioId' to be non-null");
            return $;
        }
    }

}
