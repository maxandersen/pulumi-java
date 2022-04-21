// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that contains the details about an environment&#39;s state.
 * 
 */
public final class EnvironmentStateDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final EnvironmentStateDetailsResponse Empty = new EnvironmentStateDetailsResponse();

    /**
     * Contains the code that represents the reason of an environment being in a particular state. Can be used to programmatically handle specific cases.
     * 
     */
    @Import(name="code")
    private @Nullable String code;

    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * A message that describes the state in detail.
     * 
     */
    @Import(name="message")
    private @Nullable String message;

    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    private EnvironmentStateDetailsResponse() {}

    private EnvironmentStateDetailsResponse(EnvironmentStateDetailsResponse $) {
        this.code = $.code;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentStateDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentStateDetailsResponse $;

        public Builder() {
            $ = new EnvironmentStateDetailsResponse();
        }

        public Builder(EnvironmentStateDetailsResponse defaults) {
            $ = new EnvironmentStateDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder code(@Nullable String code) {
            $.code = code;
            return this;
        }

        public Builder message(@Nullable String message) {
            $.message = message;
            return this;
        }

        public EnvironmentStateDetailsResponse build() {
            return $;
        }
    }

}
