// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerplatform.inputs;

import com.pulumi.azurenative.powerplatform.enums.State;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings concerning lockbox.
 * 
 */
public final class PropertiesLockboxArgs extends com.pulumi.resources.ResourceArgs {

    public static final PropertiesLockboxArgs Empty = new PropertiesLockboxArgs();

    /**
     * lockbox configuration
     * 
     */
    @Import(name="state")
    private @Nullable Output<Either<String,State>> state;

    public Optional<Output<Either<String,State>>> state() {
        return Optional.ofNullable(this.state);
    }

    private PropertiesLockboxArgs() {}

    private PropertiesLockboxArgs(PropertiesLockboxArgs $) {
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PropertiesLockboxArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PropertiesLockboxArgs $;

        public Builder() {
            $ = new PropertiesLockboxArgs();
        }

        public Builder(PropertiesLockboxArgs defaults) {
            $ = new PropertiesLockboxArgs(Objects.requireNonNull(defaults));
        }

        public Builder state(@Nullable Output<Either<String,State>> state) {
            $.state = state;
            return this;
        }

        public Builder state(Either<String,State> state) {
            return state(Output.of(state));
        }

        public PropertiesLockboxArgs build() {
            return $;
        }
    }

}
