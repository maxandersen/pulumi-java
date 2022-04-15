// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.enums.EntityType;
import io.pulumi.azurenative.securityinsights.inputs.ActivityEntityQueriesPropertiesQueryDefinitionsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ActivityCustomEntityQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActivityCustomEntityQueryArgs Empty = new ActivityCustomEntityQueryArgs();

    /**
     * The entity query content to display in timeline
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> content() {
        return this.content == null ? Codegen.empty() : this.content;
    }

    /**
     * The entity query description
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Determines whether this activity is enabled or disabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * The query applied only to entities matching to all filters
     * 
     */
    @Import(name="entitiesFilter")
      private final @Nullable Output<Map<String,List<String>>> entitiesFilter;

    public Output<Map<String,List<String>>> entitiesFilter() {
        return this.entitiesFilter == null ? Codegen.empty() : this.entitiesFilter;
    }

    /**
     * entity query ID
     * 
     */
    @Import(name="entityQueryId")
      private final @Nullable Output<String> entityQueryId;

    public Output<String> entityQueryId() {
        return this.entityQueryId == null ? Codegen.empty() : this.entityQueryId;
    }

    /**
     * The type of the query's source entity
     * 
     */
    @Import(name="inputEntityType")
      private final @Nullable Output<Either<String,EntityType>> inputEntityType;

    public Output<Either<String,EntityType>> inputEntityType() {
        return this.inputEntityType == null ? Codegen.empty() : this.inputEntityType;
    }

    /**
     * The kind of the entity query that supports put request.
     * Expected value is 'Activity'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
      private final Output<String> operationalInsightsResourceProvider;

    public Output<String> operationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The Activity query definitions
     * 
     */
    @Import(name="queryDefinitions")
      private final @Nullable Output<ActivityEntityQueriesPropertiesQueryDefinitionsArgs> queryDefinitions;

    public Output<ActivityEntityQueriesPropertiesQueryDefinitionsArgs> queryDefinitions() {
        return this.queryDefinitions == null ? Codegen.empty() : this.queryDefinitions;
    }

    /**
     * List of the fields of the source entity that are required to run the query
     * 
     */
    @Import(name="requiredInputFieldsSets")
      private final @Nullable Output<List<List<String>>> requiredInputFieldsSets;

    public Output<List<List<String>>> requiredInputFieldsSets() {
        return this.requiredInputFieldsSets == null ? Codegen.empty() : this.requiredInputFieldsSets;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The template id this activity was created from
     * 
     */
    @Import(name="templateName")
      private final @Nullable Output<String> templateName;

    public Output<String> templateName() {
        return this.templateName == null ? Codegen.empty() : this.templateName;
    }

    /**
     * The entity query title
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> title() {
        return this.title == null ? Codegen.empty() : this.title;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    public ActivityCustomEntityQueryArgs(
        @Nullable Output<String> content,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Map<String,List<String>>> entitiesFilter,
        @Nullable Output<String> entityQueryId,
        @Nullable Output<Either<String,EntityType>> inputEntityType,
        Output<String> kind,
        Output<String> operationalInsightsResourceProvider,
        @Nullable Output<ActivityEntityQueriesPropertiesQueryDefinitionsArgs> queryDefinitions,
        @Nullable Output<List<List<String>>> requiredInputFieldsSets,
        Output<String> resourceGroupName,
        @Nullable Output<String> templateName,
        @Nullable Output<String> title,
        Output<String> workspaceName) {
        this.content = content;
        this.description = description;
        this.enabled = enabled;
        this.entitiesFilter = entitiesFilter;
        this.entityQueryId = entityQueryId;
        this.inputEntityType = inputEntityType;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.queryDefinitions = queryDefinitions;
        this.requiredInputFieldsSets = requiredInputFieldsSets;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.templateName = templateName;
        this.title = title;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private ActivityCustomEntityQueryArgs() {
        this.content = Codegen.empty();
        this.description = Codegen.empty();
        this.enabled = Codegen.empty();
        this.entitiesFilter = Codegen.empty();
        this.entityQueryId = Codegen.empty();
        this.inputEntityType = Codegen.empty();
        this.kind = Codegen.empty();
        this.operationalInsightsResourceProvider = Codegen.empty();
        this.queryDefinitions = Codegen.empty();
        this.requiredInputFieldsSets = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.templateName = Codegen.empty();
        this.title = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityCustomEntityQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Map<String,List<String>>> entitiesFilter;
        private @Nullable Output<String> entityQueryId;
        private @Nullable Output<Either<String,EntityType>> inputEntityType;
        private Output<String> kind;
        private Output<String> operationalInsightsResourceProvider;
        private @Nullable Output<ActivityEntityQueriesPropertiesQueryDefinitionsArgs> queryDefinitions;
        private @Nullable Output<List<List<String>>> requiredInputFieldsSets;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> templateName;
        private @Nullable Output<String> title;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityCustomEntityQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.entitiesFilter = defaults.entitiesFilter;
    	      this.entityQueryId = defaults.entityQueryId;
    	      this.inputEntityType = defaults.inputEntityType;
    	      this.kind = defaults.kind;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.queryDefinitions = defaults.queryDefinitions;
    	      this.requiredInputFieldsSets = defaults.requiredInputFieldsSets;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.templateName = defaults.templateName;
    	      this.title = defaults.title;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }
        public Builder content(@Nullable String content) {
            this.content = Codegen.ofNullable(content);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder entitiesFilter(@Nullable Output<Map<String,List<String>>> entitiesFilter) {
            this.entitiesFilter = entitiesFilter;
            return this;
        }
        public Builder entitiesFilter(@Nullable Map<String,List<String>> entitiesFilter) {
            this.entitiesFilter = Codegen.ofNullable(entitiesFilter);
            return this;
        }
        public Builder entityQueryId(@Nullable Output<String> entityQueryId) {
            this.entityQueryId = entityQueryId;
            return this;
        }
        public Builder entityQueryId(@Nullable String entityQueryId) {
            this.entityQueryId = Codegen.ofNullable(entityQueryId);
            return this;
        }
        public Builder inputEntityType(@Nullable Output<Either<String,EntityType>> inputEntityType) {
            this.inputEntityType = inputEntityType;
            return this;
        }
        public Builder inputEntityType(@Nullable Either<String,EntityType> inputEntityType) {
            this.inputEntityType = Codegen.ofNullable(inputEntityType);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder operationalInsightsResourceProvider(Output<String> operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }
        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Output.of(Objects.requireNonNull(operationalInsightsResourceProvider));
            return this;
        }
        public Builder queryDefinitions(@Nullable Output<ActivityEntityQueriesPropertiesQueryDefinitionsArgs> queryDefinitions) {
            this.queryDefinitions = queryDefinitions;
            return this;
        }
        public Builder queryDefinitions(@Nullable ActivityEntityQueriesPropertiesQueryDefinitionsArgs queryDefinitions) {
            this.queryDefinitions = Codegen.ofNullable(queryDefinitions);
            return this;
        }
        public Builder requiredInputFieldsSets(@Nullable Output<List<List<String>>> requiredInputFieldsSets) {
            this.requiredInputFieldsSets = requiredInputFieldsSets;
            return this;
        }
        public Builder requiredInputFieldsSets(@Nullable List<List<String>> requiredInputFieldsSets) {
            this.requiredInputFieldsSets = Codegen.ofNullable(requiredInputFieldsSets);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder templateName(@Nullable Output<String> templateName) {
            this.templateName = templateName;
            return this;
        }
        public Builder templateName(@Nullable String templateName) {
            this.templateName = Codegen.ofNullable(templateName);
            return this;
        }
        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = Codegen.ofNullable(title);
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public ActivityCustomEntityQueryArgs build() {
            return new ActivityCustomEntityQueryArgs(content, description, enabled, entitiesFilter, entityQueryId, inputEntityType, kind, operationalInsightsResourceProvider, queryDefinitions, requiredInputFieldsSets, resourceGroupName, templateName, title, workspaceName);
        }
    }
}
