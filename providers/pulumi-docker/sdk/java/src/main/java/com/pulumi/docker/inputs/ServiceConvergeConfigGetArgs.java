// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceConvergeConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceConvergeConfigGetArgs Empty = new ServiceConvergeConfigGetArgs();

    @Import(name="delay")
    private @Nullable Output<String> delay;

    public Optional<Output<String>> delay() {
        return Optional.ofNullable(this.delay);
    }

    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private ServiceConvergeConfigGetArgs() {}

    private ServiceConvergeConfigGetArgs(ServiceConvergeConfigGetArgs $) {
        this.delay = $.delay;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceConvergeConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceConvergeConfigGetArgs $;

        public Builder() {
            $ = new ServiceConvergeConfigGetArgs();
        }

        public Builder(ServiceConvergeConfigGetArgs defaults) {
            $ = new ServiceConvergeConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder delay(@Nullable Output<String> delay) {
            $.delay = delay;
            return this;
        }

        public Builder delay(String delay) {
            return delay(Output.of(delay));
        }

        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public ServiceConvergeConfigGetArgs build() {
            return $;
        }
    }

}
