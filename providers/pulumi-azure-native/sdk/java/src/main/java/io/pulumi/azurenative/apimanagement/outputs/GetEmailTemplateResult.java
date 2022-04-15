// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.azurenative.apimanagement.outputs.EmailTemplateParametersContractPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEmailTemplateResult {
    /**
     * Email Template Body. This should be a valid XDocument
     * 
     */
    private final String body;
    /**
     * Description of the Email Template.
     * 
     */
    private final @Nullable String description;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Whether the template is the default template provided by Api Management or has been edited.
     * 
     */
    private final Boolean isDefault;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Email Template Parameter values.
     * 
     */
    private final @Nullable List<EmailTemplateParametersContractPropertiesResponse> parameters;
    /**
     * Subject of the Template.
     * 
     */
    private final String subject;
    /**
     * Title of the Template.
     * 
     */
    private final @Nullable String title;
    /**
     * Resource type for API Management resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetEmailTemplateResult(
        @CustomType.Parameter("body") String body,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isDefault") Boolean isDefault,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") @Nullable List<EmailTemplateParametersContractPropertiesResponse> parameters,
        @CustomType.Parameter("subject") String subject,
        @CustomType.Parameter("title") @Nullable String title,
        @CustomType.Parameter("type") String type) {
        this.body = body;
        this.description = description;
        this.id = id;
        this.isDefault = isDefault;
        this.name = name;
        this.parameters = parameters;
        this.subject = subject;
        this.title = title;
        this.type = type;
    }

    /**
     * Email Template Body. This should be a valid XDocument
     * 
    */
    public String body() {
        return this.body;
    }
    /**
     * Description of the Email Template.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Whether the template is the default template provided by Api Management or has been edited.
     * 
    */
    public Boolean isDefault() {
        return this.isDefault;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Email Template Parameter values.
     * 
    */
    public List<EmailTemplateParametersContractPropertiesResponse> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * Subject of the Template.
     * 
    */
    public String subject() {
        return this.subject;
    }
    /**
     * Title of the Template.
     * 
    */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    /**
     * Resource type for API Management resource.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEmailTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String body;
        private @Nullable String description;
        private String id;
        private Boolean isDefault;
        private String name;
        private @Nullable List<EmailTemplateParametersContractPropertiesResponse> parameters;
        private String subject;
        private @Nullable String title;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEmailTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.isDefault = defaults.isDefault;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.subject = defaults.subject;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
        }

        public Builder body(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = Objects.requireNonNull(isDefault);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(@Nullable List<EmailTemplateParametersContractPropertiesResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(EmailTemplateParametersContractPropertiesResponse... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder subject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetEmailTemplateResult build() {
            return new GetEmailTemplateResult(body, description, id, isDefault, name, parameters, subject, title, type);
        }
    }
}
