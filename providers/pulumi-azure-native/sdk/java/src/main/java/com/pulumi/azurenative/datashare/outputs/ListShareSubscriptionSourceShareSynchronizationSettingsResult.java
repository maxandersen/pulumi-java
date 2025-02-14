// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.outputs;

import com.pulumi.azurenative.datashare.outputs.ScheduledSourceSynchronizationSettingResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListShareSubscriptionSourceShareSynchronizationSettingsResult {
    /**
     * @return The Url of next result page.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * @return Collection of items of type DataTransferObjects.
     * 
     */
    private final List<ScheduledSourceSynchronizationSettingResponse> value;

    @CustomType.Constructor
    private ListShareSubscriptionSourceShareSynchronizationSettingsResult(
        @CustomType.Parameter("nextLink") @Nullable String nextLink,
        @CustomType.Parameter("value") List<ScheduledSourceSynchronizationSettingResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * @return The Url of next result page.
     * 
     */
    public Optional<String> nextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * @return Collection of items of type DataTransferObjects.
     * 
     */
    public List<ScheduledSourceSynchronizationSettingResponse> value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListShareSubscriptionSourceShareSynchronizationSettingsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private List<ScheduledSourceSynchronizationSettingResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListShareSubscriptionSourceShareSynchronizationSettingsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }
        public Builder value(List<ScheduledSourceSynchronizationSettingResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(ScheduledSourceSynchronizationSettingResponse... value) {
            return value(List.of(value));
        }        public ListShareSubscriptionSourceShareSynchronizationSettingsResult build() {
            return new ListShareSubscriptionSourceShareSynchronizationSettingsResult(nextLink, value);
        }
    }
}
