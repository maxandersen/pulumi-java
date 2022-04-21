// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * iOS app information
 * 
 */
public final class IosAppInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final IosAppInfoArgs Empty = new IosAppInfoArgs();

    /**
     * The name of the app. Required
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private IosAppInfoArgs() {}

    private IosAppInfoArgs(IosAppInfoArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IosAppInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IosAppInfoArgs $;

        public Builder() {
            $ = new IosAppInfoArgs();
        }

        public Builder(IosAppInfoArgs defaults) {
            $ = new IosAppInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public IosAppInfoArgs build() {
            return $;
        }
    }

}
