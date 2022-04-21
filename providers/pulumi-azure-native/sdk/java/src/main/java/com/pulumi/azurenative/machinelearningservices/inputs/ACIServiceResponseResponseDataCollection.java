// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the data collection options specified.
 * 
 */
public final class ACIServiceResponseResponseDataCollection extends com.pulumi.resources.InvokeArgs {

    public static final ACIServiceResponseResponseDataCollection Empty = new ACIServiceResponseResponseDataCollection();

    /**
     * Option for enabling/disabling Event Hub.
     * 
     */
    @Import(name="eventHubEnabled")
    private @Nullable Boolean eventHubEnabled;

    public Optional<Boolean> eventHubEnabled() {
        return Optional.ofNullable(this.eventHubEnabled);
    }

    /**
     * Option for enabling/disabling storage.
     * 
     */
    @Import(name="storageEnabled")
    private @Nullable Boolean storageEnabled;

    public Optional<Boolean> storageEnabled() {
        return Optional.ofNullable(this.storageEnabled);
    }

    private ACIServiceResponseResponseDataCollection() {}

    private ACIServiceResponseResponseDataCollection(ACIServiceResponseResponseDataCollection $) {
        this.eventHubEnabled = $.eventHubEnabled;
        this.storageEnabled = $.storageEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ACIServiceResponseResponseDataCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ACIServiceResponseResponseDataCollection $;

        public Builder() {
            $ = new ACIServiceResponseResponseDataCollection();
        }

        public Builder(ACIServiceResponseResponseDataCollection defaults) {
            $ = new ACIServiceResponseResponseDataCollection(Objects.requireNonNull(defaults));
        }

        public Builder eventHubEnabled(@Nullable Boolean eventHubEnabled) {
            $.eventHubEnabled = eventHubEnabled;
            return this;
        }

        public Builder storageEnabled(@Nullable Boolean storageEnabled) {
            $.storageEnabled = storageEnabled;
            return this;
        }

        public ACIServiceResponseResponseDataCollection build() {
            return $;
        }
    }

}
