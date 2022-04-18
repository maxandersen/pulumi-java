// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageListSelectItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentMessageListSelectResponse {
    /**
     * List items.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageListSelectItemResponse> items;
    /**
     * Optional. Subtitle of the list.
     * 
     */
    private final String subtitle;
    /**
     * Optional. The overall title of the list.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageListSelectResponse(
        @CustomType.Parameter("items") List<GoogleCloudDialogflowV2IntentMessageListSelectItemResponse> items,
        @CustomType.Parameter("subtitle") String subtitle,
        @CustomType.Parameter("title") String title) {
        this.items = items;
        this.subtitle = subtitle;
        this.title = title;
    }

    /**
     * List items.
     * 
    */
    public List<GoogleCloudDialogflowV2IntentMessageListSelectItemResponse> items() {
        return this.items;
    }
    /**
     * Optional. Subtitle of the list.
     * 
    */
    public String subtitle() {
        return this.subtitle;
    }
    /**
     * Optional. The overall title of the list.
     * 
    */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageListSelectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageListSelectItemResponse> items;
        private String subtitle;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageListSelectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder items(List<GoogleCloudDialogflowV2IntentMessageListSelectItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GoogleCloudDialogflowV2IntentMessageListSelectItemResponse... items) {
            return items(List.of(items));
        }
        public Builder subtitle(String subtitle) {
            this.subtitle = Objects.requireNonNull(subtitle);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageListSelectResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageListSelectResponse(items, subtitle, title);
        }
    }
}
