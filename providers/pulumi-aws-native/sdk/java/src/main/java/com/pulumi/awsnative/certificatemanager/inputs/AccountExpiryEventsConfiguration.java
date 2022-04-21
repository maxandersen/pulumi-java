// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.certificatemanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountExpiryEventsConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final AccountExpiryEventsConfiguration Empty = new AccountExpiryEventsConfiguration();

    @Import(name="daysBeforeExpiry")
    private @Nullable Integer daysBeforeExpiry;

    public Optional<Integer> daysBeforeExpiry() {
        return Optional.ofNullable(this.daysBeforeExpiry);
    }

    private AccountExpiryEventsConfiguration() {}

    private AccountExpiryEventsConfiguration(AccountExpiryEventsConfiguration $) {
        this.daysBeforeExpiry = $.daysBeforeExpiry;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountExpiryEventsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountExpiryEventsConfiguration $;

        public Builder() {
            $ = new AccountExpiryEventsConfiguration();
        }

        public Builder(AccountExpiryEventsConfiguration defaults) {
            $ = new AccountExpiryEventsConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder daysBeforeExpiry(@Nullable Integer daysBeforeExpiry) {
            $.daysBeforeExpiry = daysBeforeExpiry;
            return this;
        }

        public AccountExpiryEventsConfiguration build() {
            return $;
        }
    }

}
