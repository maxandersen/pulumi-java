// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;The configuration for a render farm that is associated with a studio resource.&lt;/p&gt;
 * 
 */
public final class StudioComponentComputeFarmConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final StudioComponentComputeFarmConfigurationArgs Empty = new StudioComponentComputeFarmConfigurationArgs();

    /**
     * &lt;p&gt;The name of an Active Directory user that is used on ComputeFarm worker instances.&lt;/p&gt;
     * 
     */
    @Import(name="activeDirectoryUser")
    private @Nullable Output<String> activeDirectoryUser;

    public Optional<Output<String>> activeDirectoryUser() {
        return Optional.ofNullable(this.activeDirectoryUser);
    }

    /**
     * &lt;p&gt;The endpoint of the ComputeFarm that is accessed by the studio component resource.&lt;/p&gt;
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    private StudioComponentComputeFarmConfigurationArgs() {}

    private StudioComponentComputeFarmConfigurationArgs(StudioComponentComputeFarmConfigurationArgs $) {
        this.activeDirectoryUser = $.activeDirectoryUser;
        this.endpoint = $.endpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StudioComponentComputeFarmConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StudioComponentComputeFarmConfigurationArgs $;

        public Builder() {
            $ = new StudioComponentComputeFarmConfigurationArgs();
        }

        public Builder(StudioComponentComputeFarmConfigurationArgs defaults) {
            $ = new StudioComponentComputeFarmConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder activeDirectoryUser(@Nullable Output<String> activeDirectoryUser) {
            $.activeDirectoryUser = activeDirectoryUser;
            return this;
        }

        public Builder activeDirectoryUser(String activeDirectoryUser) {
            return activeDirectoryUser(Output.of(activeDirectoryUser));
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public StudioComponentComputeFarmConfigurationArgs build() {
            return $;
        }
    }

}
